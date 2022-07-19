package com.sb.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.comp.Flipkart;

public class StrategyDPTest3_Support_Pre_Intantiations {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext1.xml");
		System.out.println("bean container is created");
		
		
		  //get target class object Flipkart fpkt =
		  factory.getBean("fpkt",Flipkart.class);
		  
		 /* //invoke the b.method String resultMsg = fpkt.shopping(new String[]
		 * {"shirt","pant","mobile"}, new float[] {345.0f,599.0f,15000.0f});
		 * System.out.println(resultMsg);
		 */
	}//main

}//class
