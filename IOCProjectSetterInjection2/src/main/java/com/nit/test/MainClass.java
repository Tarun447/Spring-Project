package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Hello;

public class MainClass {

	public static void main(String[] args) {
	FileSystemResource res = new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
	XmlBeanFactory xs = new XmlBeanFactory(res);
	Hello h = (Hello)xs.getBean("hi");
	int hr = h.getHour();
	System.out.println("Hour : "+hr);
	}

}
