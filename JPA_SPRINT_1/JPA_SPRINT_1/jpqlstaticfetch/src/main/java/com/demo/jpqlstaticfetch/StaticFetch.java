package com.demo.jpqlstaticfetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.jpqlstaticfetch.entity.Student;

public class StaticFetch 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
	          em.getTransaction().begin( );  
	                    
	          Query query = em.createQuery("Select s from Student s");  
	          @SuppressWarnings("unchecked")  
	        List<Student> list = query.getResultList();  
	          System.out.println("Student details :");  
	          for(Student s:list) {  
	                
	             System.out.println(  s.getS_id() + ""+ s.getS_age()+" "+ s.getS_name());  
	          }
	          em.close();  
	          emf.close();  
    
}
}
