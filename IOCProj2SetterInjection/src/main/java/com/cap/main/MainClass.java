package com.cap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cap.beans.Hello;

public class MainClass {
public static void main(String[] args) {

	ApplicationContext ac = new ClassPathXmlApplicationContext("com/cap/cfng/applicationContext.xml");
	Hello h = (Hello)ac.getBean("hl");
	h.say();
	
}
}
