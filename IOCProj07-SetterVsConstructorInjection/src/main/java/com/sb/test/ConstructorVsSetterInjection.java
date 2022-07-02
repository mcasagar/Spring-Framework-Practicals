package com.sb.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.beans.Costomer;
import com.sb.beans.Employee1;
import com.sb.beans.Student;

public class ConstructorVsSetterInjection {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cnfg/applicationContext.xml");
		
		//get spring bean class object
		Employee1 emp1 = factory.getBean("emp1",Employee1.class);
		System.out.println(emp1);
		
		System.out.println("=====================================");
		
		Student s1 = factory.getBean("stud",Student.class);
		System.out.println(s1);
		
		System.out.println("=====================================");
		
		Costomer cost1 = factory.getBean("cust",Costomer.class);
		System.out.println(cost1);

	}

}
