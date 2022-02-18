package InheritanceSpring.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      TextEditer te = (TextEditer) context.getBean("textEditer");
		      te.spellCheck();
		   }
}
