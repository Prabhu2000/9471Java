package jpasamplefinding.jpasamplefinding;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpasamplefinding.jpasamplefinding.entity.StudentEntity;
public class FindStudent 
{
	public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_detail");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        StudentEntity s=em.find(StudentEntity.class,102);  
          
        System.out.println("Student id = "+s.getS_id());  
        System.out.println("Student Name = "+s.getS_name());  
        System.out.println("Student Age = "+s.getS_age());  
        
        em.getTransaction().commit();
        
        emf.close();
        em.close();
}
}
