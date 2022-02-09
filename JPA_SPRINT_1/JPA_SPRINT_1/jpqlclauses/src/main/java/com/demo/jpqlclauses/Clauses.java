package com.demo.jpqlclauses;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.jpqlclauses.entity.Student;


public class Clauses 
{
    public static void main( String[] args )
    {
    	
    	
    	    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
    	        EntityManager em = emf.createEntityManager();  
    		          em.getTransaction().begin( );  
    		                    
    		          Query query1 = em.createQuery("Update Student SET s_age = 26 where s_id >=2 "); 
    		          query1.executeUpdate();
    		          //em.getTransaction().commit();
    		          
    		          Query query2 = em.createQuery("Delete from Student where s_id = 4 "); 
    		          query2.executeUpdate();
    		          em.getTransaction().commit();
    		          
    		          
    		          Query query3 = em.createQuery("select count(s) from Student s "); 
    		          System.out.println("Total Records:" + query3.getSingleResult());
    		          
    		          Query query4 = em.createQuery("select Max(s.s_age) from Student s " ); 
    		          System.out.println("Max age:" + query4.getSingleResult());
    	    		          
    		          
    		          Query query5 = em.createQuery("select Min(s.s_age) from Student s "); 
    		          System.out.println("Min age:" + query5.getSingleResult());
                      
    		          Query queryn = em.createQuery("select from Student s where s_age between 23 and 26 ");
    		          @SuppressWarnings("unchecked")  
    		        List<Student> list = queryn.getResultList();  
    		          System.out.println("Student details :");  
    		          for(Student s:list) {  
    		                
    		             System.out.println(s.getS_id()+" "+s.getS_age()+" "+s.getS_name());  
    		          }
    		          

    		          em.close();  
    		          emf.close();  
    	    
    	}
    	
  
    }

