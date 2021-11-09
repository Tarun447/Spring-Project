package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
//	FileSystemResource res = new FileSystemResource("src/main/java/com/nit/applicationContext.xml");
//	XmlBeanFactory xs = new XmlBeanFactory(res);
	ApplicationContext xs = new ClassPathXmlApplicationContext("com/nit/applicationContext.xml");
	HelloWorld hw = (HelloWorld)xs.getBean("hl");
	hw.sayHello();
	
	HelloWorld hw1 = (HelloWorld)xs.getBean("hello");
	hw1.sayHello();
	
}
}
