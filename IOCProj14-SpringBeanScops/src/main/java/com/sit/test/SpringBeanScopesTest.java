package com.sit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.beans.WishMessegeGenerator;

public class SpringBeanScopesTest {

	public static void main(String[] args) {
		//creat IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cfgs/applicationContex.xml");
		//get target spring bean class object
		WishMessegeGenerator generator1 = factory.getBean("wmg",WishMessegeGenerator.class);
		WishMessegeGenerator generator2 = factory.getBean("wmg",WishMessegeGenerator.class);
		System.out.println(generator1.hashCode()+"   "+generator2.hashCode());
		System.out.println("generator1==generator2"+(generator1==generator2));
		System.out.println("=======================================================================");
		WishMessegeGenerator generator3 = factory.getBean("wmg1",WishMessegeGenerator.class);
		WishMessegeGenerator generator4 = factory.getBean("wmg1",WishMessegeGenerator.class);
		System.out.println(generator3.hashCode()+"   "+generator4.hashCode());
		System.out.println("generator1==generator2"+(generator3==generator4));
		
		//invoke the b. method
		String result = generator1.generateMessege("raja");
		System.out.println("Wish Messege is :: "+result);

	}//main

}//class
