package com.sb.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.sb.comp.Courier;
import com.sb.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		System.out.println("Flipkart static block");
		try {
			//loads properties file
			FileInputStream fis = new FileInputStream("src/main/java/com/sb/common/info.properties");
			//loads the properties file contents to java.util.Properties class object
			props = new Properties();
			props.load(fis);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//static factory method supporting factory pattern
	public static Flipkart creatFlipkart()throws Exception {
		//create target class object 
		Flipkart fpkt = new Flipkart();
		
		//load dependent class 
		Class c=Class.forName(props.getProperty("dependent.comp"));
		//Create object using reflection API
		Constructor cons[] = c.getDeclaredConstructors();
		//create object
		Courier courier = (Courier)cons[0].newInstance();
		//set dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}
}
