package com.sb.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.beans.A;

public class CyclicDITest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cnfg/applicationContext.xml");
		
		//get bean class object
		A a = factory.getBean("a1",A.class);
		System.out.println(a); 

	}

}
