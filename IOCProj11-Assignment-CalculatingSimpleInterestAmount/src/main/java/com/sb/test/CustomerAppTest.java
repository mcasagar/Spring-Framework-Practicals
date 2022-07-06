package com.sb.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.controller.MainController;
import com.sb.vo.CustomerVO;

public class CustomerAppTest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cnfg/applicationContext.xml");
		//get Spring bean class object reference
		MainController controller = factory.getBean("controller",MainController.class);
		//read inputs as String values and store them into EmployeeVO class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name :: ");
		String name = sc.next();
		System.out.println("Enter Customer Address :: ");
		String addrs = sc.next();
		System.out.println("Enter Principal Amount :: ");
		String principalAmount = sc.next();
		System.out.println("Enter Rate :: ");
		String rate = sc.next();
		System.out.println("Enter Time :: ");
		String time = sc.next();
		CustomerVO vo = new CustomerVO();
		vo.setCname(name); vo.setAddrs(addrs); vo.setPrincipalAmount(principalAmount); vo.setRate(rate);vo.setTime(time);
		//invoke b.method
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
