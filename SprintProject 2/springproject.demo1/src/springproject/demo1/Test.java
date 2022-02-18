package springproject.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
		public static void main(String[] args) {  
			Resource resource=new ClassPathResource("applicationContext.xml");  
			    @SuppressWarnings("deprecation")
				BeanFactory factory=new XmlBeanFactory(resource);  
				      
		    Student student=(Student)factory.getBean("studentbean");  
				    student.displayInfo();
				    
				   /* ApplictionContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
				      
				    Student student=(Student)ac.getBean("studentbean");  
						    student.displayInfo(); 
						    ((ClassPathXmlApplicationContext) ac).close();*/
		}
}