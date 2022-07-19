package com.sit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.WishMessegeGenerator2;

public class AutowiredTest2 {

	public static void main(String[] args) {
		//create IOC Container 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sb/cfgs/applicationContex2.xml");
		
		//get spring bean class object
		WishMessegeGenerator2 generator = ctx.getBean("wmg",WishMessegeGenerator2.class);
		//invoke the b. method
		String result = generator.generateMessege("raja");
		System.out.println("Wish Messege is :: "+result);

	}//main

}//class
