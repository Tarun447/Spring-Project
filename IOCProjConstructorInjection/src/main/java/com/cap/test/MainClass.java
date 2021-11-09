package com.cap.test;

import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.cap.beans.WishMessage;

public class MainClass {

	public static void main(String[] args) {
	FileSystemResource res = new FileSystemResource("src/main/java/com/cap/cfgs/applicationContext.xml");
	XmlBeanFactory xf = new XmlBeanFactory(res);
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Name : ");
	String name = s.nextLine();
	WishMessage wm = (WishMessage)xf.getBean("wm");
	String result = wm.sayGreet(name);
	System.out.println(result);
	
	
	

	}

}
