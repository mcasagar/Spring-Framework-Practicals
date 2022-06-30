package com.sit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishMessegeGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//hold spring bean file configuration name and location 
		FileSystemResource res = new FileSystemResource("src/main/java/com/sb/cfgs/applicationContex.xml");
		//create IOC Container nothing but bean factory container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//get target spring bean class object
		Object obj = factory.getBean("wmg");
		//type casting
		WishMessegeGenerator generator = (WishMessegeGenerator)obj; 	 
		
		//invoke the b. method
		String result = generator.generateMessege("raja");
		System.out.println("Wish Messege is :: "+result);

	}//main

}//class
