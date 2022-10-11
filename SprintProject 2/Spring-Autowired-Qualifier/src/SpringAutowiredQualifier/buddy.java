package SpringAutowiredQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class buddy {
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 Human human =context.getBean("human",Human.class);
		 human.startpumping();
	}

}
