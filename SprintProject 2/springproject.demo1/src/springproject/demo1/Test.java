package springproject.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
		public static void main(String[] args) {  
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Tom tom = context.getBean("studentbean",Tom.class);
		
		 tom.displayInfo(" ");
		 tom.name();
		}
}