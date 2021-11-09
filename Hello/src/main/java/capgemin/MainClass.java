package capgemin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("capgemin/spring.xml");
	Hello h = (Hello)ac.getBean("hl");
	h.say();
	}

}
