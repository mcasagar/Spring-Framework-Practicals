package com.sit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.beans.WishMessegeGenerator;
import com.sb.singleton.Printer;

public class SpringBeanScopesTest1 {

	public static void main(String[] args) {
		//creat IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cfgs/applicationContex.xml");
		//get target spring bean class object
		Printer p1 = factory.getBean("p1",Printer.class);
		Printer p2 = factory.getBean("p1",Printer.class);
		System.out.println("HashCode : "+p1.hashCode()+ "  "+p2.hashCode());
		System.out.println("p1==p2 : "+(p1==p2));
		
		System.out.println("================================================================");
		
		Printer p3 = factory.getBean("p1",Printer.class);
		Printer p4 = factory.getBean("p",Printer.class);
		System.out.println("HashCode : "+p3.hashCode()+ "  "+p4.hashCode());
		System.out.println("p3==p4 : "+(p3==p4));
		
		
	}//main

}//class
