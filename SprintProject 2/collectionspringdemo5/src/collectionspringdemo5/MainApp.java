package collectionspringdemo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) { 
	 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	 JavaCollection java =context.getBean("javaCollection",JavaCollection.class);
	 java.displayinfo();
	 
  }
}
