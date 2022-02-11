package com.demo.jpainheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpainheritance.entity.ActiveEmployee;
import com.demo.jpainheritance.entity.RetiredEmployee;

public class EmployeePersistence 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_data");  
    	    EntityManager em=emf.createEntityManager();  
    	      
    	    em.getTransaction().begin();  
    	      
    	      
    	ActiveEmployee ae1=new ActiveEmployee(12000,5,101,"Aditya");  
    	ActiveEmployee ae2=new ActiveEmployee(12000,7,102,"Rishab");  
    	  
    	RetiredEmployee re1=new RetiredEmployee(5000,5,103,"Ramesh");  
    	RetiredEmployee re2=new RetiredEmployee(7000,7,104,"Amit");  
    	  
    	    em.persist(ae1);  
    	    em.persist(ae2);  
    	      
    	    em.persist(re1);  
    	    em.persist(re2);  
    	      
    	    em.getTransaction().commit();  
    	      
    	    em.close();  
    	    emf.close();  
    	      
    	}
    }

