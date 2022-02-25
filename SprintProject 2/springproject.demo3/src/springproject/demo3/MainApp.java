package springproject.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      
	      ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld hello= context.getBean("helloWorld",HelloWorld.class);
	      hello.displayinfo();
	      
	      HelloIndia ind = context.getBean("helloIndia",HelloIndia.class);
	      ind.displayinfo();
	     
	   }
	}

