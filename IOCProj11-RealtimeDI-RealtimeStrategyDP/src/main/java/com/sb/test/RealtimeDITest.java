package com.sb.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.controller.MainController;
import com.sb.vo.EmployeeVO;
	
public class RealtimeDITest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sb/cnfg/applicationContext.xml");
		//get Spring bean class object reference
		 MainController controller = factory.getBean("controller",MainController.class);
		 //read inputs as STring values and store them into EmployeeVO class object
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Name :: ");
		 String name = sc.next();
		 System.out.println("Enter Employee Desg :: ");
		 String desg = sc.next();
		 System.out.println("Enter Employee basicSalary");
		 String basicSalary = sc.next();
		 EmployeeVO vo = new EmployeeVO();
		 vo.setEname(name); vo.setDesg(desg); vo.setBasicSalary(basicSalary);
		 //invoke b.methods
		 try {
			 String result = controller.processEmployee(vo);
			 System.out.println(result);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}//main

}//class
