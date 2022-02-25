package SpringInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String[] args) {
	
	  ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	  Student adi =context.getBean("student",Student.class); 
	  adi.displayinfo();
	 
	
	  Student dilipN =context.getBean("dilip",Student.class);
	  dilipN.displayinfo();
	
	
}
}
