package org.com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
	
		
		//read spring bean config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/com/capgemini/spring.xml");
		
		
		// get the bean from the spring container
		Coach c = context.getBean("ccoach",Coach.class);
		// call a method on th bean
		c.getDailyWorkout();
		
		
		
		// close the bean
     context.close();
	}

}