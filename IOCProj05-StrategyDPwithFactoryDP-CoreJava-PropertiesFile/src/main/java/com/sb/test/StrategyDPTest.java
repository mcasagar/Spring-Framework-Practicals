package com.sb.test;

import com.sb.comp.Flipkart;
import com.sb.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			//get target class object from factory
			Flipkart fpkt = FlipkartFactory.creatFlipkart();
			//invoke the business method
			String result = fpkt.shopping(new String[] {"shirt","pant","TV"}, new float[] {699.0f, 999.0f, 45000.0f});
			System.out.println(result);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch

	}//main

}//class
