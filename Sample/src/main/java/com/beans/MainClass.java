package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/cfng/applicationContext.xml");
		Department d = (Department)ac.getBean("dpt");
		System.out.println(d);

	}

}
