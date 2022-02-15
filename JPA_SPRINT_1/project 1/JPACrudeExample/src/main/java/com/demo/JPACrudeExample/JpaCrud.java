package com.demo.JPACrudeExample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.demo.JPACrudeExample.Entity.Player;

public class JpaCrud 
{
    public static void main( String[] args ) throws Exception
    {
   	
        /**JpaCrud.createRecord();
        JpaCrud.retrieveRecord();
        JpaCrud.updateRecord();
        JpaCrud.deleteRecord();
        JpaCrud.queryRecord();
        JpaCrud.findbynamequeryRecord();
        JpaCrud.findByFuzzyNamedQuery();
        JpaCrud.criteriaQuery();
        JpaCrud.criteriaCountQuery();
        JpaCrud.criteriaVerifiedUsersQuery(); 
        JpaCrud.criteriaLoginNameAndPassword();
        JpaCrud.criteriaFindByCommonPassword();
        JpaCrud.criteriaFuzzyEmail();**/
        JpaCrud.criteriaBetweenDates();
    }
    
	

	private static void createRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JPA_CRUD" );  
        
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();  
        Player p1= new Player();
		p1.setLoginName("Aditya");
		p1.setEmailAddress("Aditya@19gmail.com");
		p1.setPassword("Aditya123");
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    //Date date = new Date();
	   // p1.setRegistrationDate(formatter.format(date).toString());
		p1.setVerified(true);
		p1.setLastAccessTime(new java.util.Date());
		
		Player p2= new Player();
		p2.setLoginName("Mayuresh");
		p2.setEmailAddress("Mayuresh@19gmail.com");
		p2.setPassword("Mayuresh123");
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    //Date date = new Date();
	   // p1.setRegistrationDate(formatter.format(date).toString());
		p2.setVerified(true);
		p2.setLastAccessTime(new java.util.Date());
		
		Player p3= new Player();
		p3.setLoginName("sunny");
		p3.setEmailAddress("sunny@19gmail.com");
		p3.setPassword("sunny123");
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    //Date date = new Date();
	   // p1.setRegistrationDate(formatter.format(date).toString());
		p3.setVerified(true);
		p3.setLastAccessTime(new java.util.Date());
		
		Player p4= new Player();
		p4.setLoginName("Sumy");
		p4.setEmailAddress("sumy@19gmail.com");
		p4.setPassword("sumy123");
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    //Date date = new Date();
	   // p1.setRegistrationDate(formatter.format(date).toString());
		p4.setVerified(true);
		p4.setLastAccessTime(new java.util.Date());
	
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		em.getTransaction().commit();
	    Query query = em.createQuery("select p1 from Player p1" );
	    List<Player> list = query.getResultList();  
        System.out.println("Player details :");  
        for(Player s:list) {  
              
           System.out.println(s);  
        }
        em.close();
		emf.close();
		
		}

	private static void retrieveRecord() {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			 EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
     
			Long key = Long.valueOf(1);
			Player p = em.find(Player.class, key);
			System.out.println("Retrieve Data:");
			System.out.println(p.getPassword()+" "+p.getLoginName());

			em.getTransaction().commit();
			
		}
	private static void updateRecord() {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin(); 

			Long key = Long.valueOf(1);
			Player p = entityManager.find(Player.class, Long.valueOf(1));
			p.setPassword("kowabunga");
			System.out.println("Update Data");
			System.out.println(p.getPassword());

			entityManager.getTransaction().commit();
		}
	
   private static void deleteRecord() {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, key);
		entityManager.remove(p); // record is deleted
		System.out.println("Delete Data:");
		System.out.println(p);

		entityManager.getTransaction().commit();
	}

private static void queryRecord() {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager entityManager = emf.createEntityManager();
	entityManager.getTransaction().begin();

	Query query = entityManager.createQuery("select distinct p from Player as p", Player.class);
	

	List<Player> players = query.getResultList();
    System.out.println("Query Record:");	
    for (Player playa : players) {
		System.out.println("The password is :" + playa.getPassword());
	}

	for (int i = 0; i < players.size(); i++) {
		Player player = players.get(i);
		System.out.println(player.getLoginName());
	}
	entityManager.flush();
	//entityManager.detach(arg0);h();
	entityManager.getTransaction().commit();
}
private static void findbynamequeryRecord() {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query=  entityManager.createNamedQuery("Player.findByEmail");
		query.setParameter("email", "Aditya@19gmail.com");
		List<Player> players = query.getResultList();

		for (Player playa : players) {
			System.out.println("Find BY Email:");		
			System.out.println(playa);
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		
		entityManager.getTransaction().commit();
	}
private static void findByFuzzyNamedQuery() {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager entityManager = emf.createEntityManager();
	entityManager.getTransaction().begin();

	Query query=  entityManager.createNamedQuery("Player.findByFuzzyEmail");
	query.setParameter("email", "%ad%");
	List<Player> players = query.getResultList();

	for (Player playa : players) {
		System.out.println("FindFuzzyEmail:");
		System.out.println(playa);
	}

	for (int i = 0; i < players.size(); i++) {
		Player player = players.get(i);
		System.out.println(player.getLoginName());
	}
	entityManager.getTransaction().commit();
}
private static void criteriaQuery() {
	// TODO Auto-generated method stub
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		
		Root<Player> from = cQuery.from(Player.class);  
		cQuery.orderBy(builder.asc(from.get("loginName")));
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		List<Player> players = query.getResultList();
	    for (Player playa : players){
		System.out.println(playa.getLoginName());
	    }
		em.getTransaction().commit();
	}
   private static void criteriaCountQuery() {
	// TODO Auto-generated method stub
	 
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Long> cQuery = builder.createQuery(Long.class);
			cQuery.select(builder.count(cQuery.from(Player.class)));
			
			TypedQuery<Long> query = em.createQuery(cQuery);
			System.out.println(query.getSingleResult());
			em.getTransaction().commit();
		}


private static void criteriaVerifiedUsersQuery() {
	// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<Boolean> flag = builder.parameter(Boolean.class);
		Predicate expression = builder.equal(root.get("verified"), flag);
		
		cQuery.select(root).where(expression);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		query.setParameter(flag, true);
		List<Player> players = query.getResultList();
		for (Player playa : players ) {
			System.out.println(playa.getPassword());
		}
		
		em.getTransaction().commit();
	}
	
private static void criteriaLoginNameAndPassword() {
	// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		
		ParameterExpression<String> password = builder.parameter(String.class);
		Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
		
		ParameterExpression<String> loginName = builder.parameter(String.class);
		Expression<Boolean> loginExpression = builder.equal(root.get("loginName"), loginName);
		
		
		Predicate loginAndPassword = builder.and(loginExpression, passwordExpression);
		
		cQuery.select(root).where(loginAndPassword);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		query.setParameter(loginName, "Aditya");
		query.setParameter(password, "Aditya123");
		Player player = query.getSingleResult();
		System.out.println(player);
		
		em.getTransaction().commit();
	}
private static void criteriaFindByCommonPassword() {
	// TODO Auto-generated method stub
	


	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	CriteriaBuilder builder = em.getCriteriaBuilder();
	CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
	
	Root<Player> root = cQuery.from(Player.class);     
	
	ParameterExpression<String> password = builder.parameter(String.class);
	Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
	cQuery.select(root).where(passwordExpression);
	
	TypedQuery<Player> query = em.createQuery(cQuery);
	query.setParameter(password, "pwd");
	List<Player> players = query.getResultList();
	for(Player playa: players){
	System.out.println(playa.getLoginName());
	}
	em.getTransaction().commit();
}
private static void criteriaFuzzyEmail() {
	// TODO Auto-generated method stub
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
		
		Root<Player> root = cQuery.from(Player.class);     
		Predicate predicate = builder.like(root.get("emailAddress"), "%Mayuresh@19%");
		
		cQuery.select(root).where(predicate);
		
		TypedQuery<Player> query = em.createQuery(cQuery);
		//query.setParameter(email, true);
		List<Player> players = query.getResultList();
		for(Player playa : players) {
		System.out.println(playa.getEmailAddress());
		}
		em.getTransaction().commit();
	}
public static void criteriaBetweenDates() throws Exception {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	CriteriaBuilder builder = em.getCriteriaBuilder();
	CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
	
	Root<Player> root = cQuery.from(Player.class);     
	
	ParameterExpression<String> email = builder.parameter(String.class);
	//Predicate predicate = builder.like(root.get("emailAddress"), "%scja%");
	java.text.SimpleDateFormat textFormat = 
		    new java.text.SimpleDateFormat("yyyy-MM-dd");
	Date startDate = new Date();
	startDate = textFormat.parse("1998-1-1");
	
	Date endDate = new Date();
	startDate = textFormat.parse("2018-6-1");
	
	Predicate predicate =  builder.between(root.get("lastAccessTime"), startDate, endDate);
	    //predicate.add(date);

	cQuery.select(root).where(predicate);
	
	TypedQuery<Player> query = em.createQuery(cQuery);
	//query.setParameter(email, true);
	List<Player> players = query.getResultList();
	//players.forEach(player -> System.out.println(player.getLastAccessTime())); 
	for (Player playa : players) {
	List<Player> users = new java.util.ArrayList();
	//users.add(player);
	}
	em.getTransaction().commit();
}
}




	






	


		
	
	