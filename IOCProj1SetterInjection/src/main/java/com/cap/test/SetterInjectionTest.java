package com.cap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cap.beans.WishMessage;

public class SetterInjectionTest {

	public static void main(String[] args) {
//		FileSystemResource res = new FileSystemResource("src/main/java/com/cap/cfgs/applicationContext.xml");
//		XmlBeanFactory xf = new XmlBeanFactory(res);
		ApplicationContext xf = new ClassPathXmlApplicationContext("com/cap/cfgs/applicationContext.xml");
		WishMessage wm = (WishMessage)xf.getBean("wm");
		String result = wm.greet("Tarun");
		System.out.println("Hay "+result);
		

	}

}
