package com.sb.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantiationTest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cnfg/applicationContext.xml");
		
		//get spring bean class object
		Class clazz = factory.getBean("c1",Class.class);
		System.out.println("clazz object class name : "+clazz.getClass()+ " clazz object data : "+clazz.toString());
		Calendar cal = factory.getBean("cal",Calendar.class);
		System.out.println("cal object class name : "+cal.getClass()+ " cal object data : "+cal.toString());
		Properties prop = factory.getBean("props",Properties.class);
		System.out.println("prop object class name : "+prop.getClass()+ " prop object data : "+prop.toString());
		String s= factory.getBean("s1",String.class);
		System.out.println("s object class name : "+s.getClass()+ " s object data : "+s.toString());
		System.out.println("===========================================================================================================================");
		String ss= factory.getBean("s2",String.class);
		System.out.println("ss object class name : "+ss.getClass()+ " ss object data : "+ss.toString());
		String sss= factory.getBean("s3",String.class);
		System.out.println("sss object class name : "+sss.getClass()+ " sss object data : "+sss.toString());
		

	}

}
