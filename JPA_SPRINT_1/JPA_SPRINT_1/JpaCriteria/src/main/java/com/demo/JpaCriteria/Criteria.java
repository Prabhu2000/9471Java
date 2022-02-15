package com.demo.JpaCriteria;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.demo.JpaCriteria.entity.Student;

public class Criteria 
{
    public static void main( String[] args ) {
    	//Criteria.MultiselectRecord();
    	//Criteria.SelectRecord();
    	Criteria.AscRecord();
    	Criteria.DescRecord();
    }
   
	private static void SelectRecord() {
		// TODO Auto-generated method stub
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();  
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
          
       Root<Student> stud=cq.from(Student.class);  
       
        cq.select(stud); 
        CriteriaQuery<Student> select = cq.select(stud);  
        TypedQuery<Student> q = em.createQuery(select);  
        List<Student> list = q.getResultList();  

        System.out.println("s_id");  
        
        for(Student s:list)  
        {  
        System.out.println(s.getS_id());  
    
      }  
          
em.getTransaction().commit();  
        em.close();  
        emf.close();    

   }
private static void MultiselectRecord() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin();  
         CriteriaBuilder cb=em.getCriteriaBuilder();  
         CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
           
        Root<Student> stud=cq.from(Student.class);  
         
         cq.multiselect(stud.get("s_name")); 
         CriteriaQuery<Student> multiselect = cq.multiselect(stud);  
         TypedQuery<Student> q = em.createQuery(multiselect);  
         List<Student> list = q.getResultList();  
 
         System.out.println("s_id");  
        
         for(Student s:list)  
         {  
         System.out.println(s.getS_id());  
     
       }  
           
em.getTransaction().commit();  
         em.close();  
         emf.close();    

    }
private static void AscRecord() {
	// TODO Auto-generated method stub
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	 	          EntityManager em = emf.createEntityManager();  
	 	          em.getTransaction().begin( );  
	 	          CriteriaBuilder cb=em.getCriteriaBuilder();  
	 	          CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
	 	            
	 	         Root<Student> stud=cq.from(Student.class);  
	 	          
	 	         cq.orderBy(cb.asc(stud.get("s_age")));  
	 	          CriteriaQuery<Student> select = cq.select(stud);  
	 	          TypedQuery<Student> q = em.createQuery(select);  
	 	          List<Student> list = q.getResultList();  
	 	  
	 	          System.out.print("s_id");  
	 	             System.out.print("\t s_name");  
	 	             System.out.println("\t s_age");  
	 	            
	 	          for(Student s:list)  
	 	          {  
	 	          System.out.println("Asc Record");
	 	          System.out.print(s.getS_id());  
	 	          System.out.print("\t"+s.getS_name());  
	 	          System.out.println("\t"+s.getS_age());  
	 	          }   
	 	            
	 	em.getTransaction().commit();  
	 	          em.close();  
	 	          emf.close();    
	 	     }  
private static void DescRecord() {
	// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
		          EntityManager em = emf.createEntityManager();  
		          em.getTransaction().begin( );  
		          CriteriaBuilder cb=em.getCriteriaBuilder();  
		          CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
		            
		         Root<Student> stud=cq.from(Student.class);  
		          
		          cq.orderBy(cb.desc(stud.get("s_age")));  
		          CriteriaQuery<Student> select = cq.select(stud);  
		          TypedQuery<Student> q = em.createQuery(select);  
		          List<Student> list = q.getResultList();  
		  
		          System.out.print("s_id");  
		          System.out.print("\t s_name");  
	              System.out.println("\t s_age");  
		            
		          for(Student s:list)  
		          {  
		          System.out.println("Desc Record:");
		          System.out.print(s.getS_id());  
		          System.out.print("\t"+s.getS_name());  
		          System.out.println("\t"+s.getS_age());  
		          }  
		   
		        em.getTransaction().commit();  
	            em.close();  
		        emf.close();    
	     }  
		
}
	




