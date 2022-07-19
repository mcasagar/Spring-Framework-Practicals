package com.sb.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sb.comp.Flipkart;

public class StrategyDP_Lazy_init_Test4 {

	public static void main(String[] args) {
		//create IOC Container
//		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/sb/cnfg/applicationContext.xml");
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sb/cnfg/applicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//get target class object
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		//invoke the b.method
		String resultMsg = fpkt.shopping(new String[] {"shirt","pant","mobile"}, new float[] {345.0f,599.0f,15000.0f});
		System.out.println(resultMsg);
	}//main

}//class
