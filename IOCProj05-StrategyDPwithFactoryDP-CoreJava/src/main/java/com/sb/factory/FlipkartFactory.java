package com.sb.factory;

import com.sb.comp.BlueDart;
import com.sb.comp.Courier;
import com.sb.comp.DTDC;
import com.sb.comp.Flipkart;

public class FlipkartFactory {
	//static factory method supporting factory pattern
	public static Flipkart creatFlipkart(String courierType) {
		//create target class object 
		Flipkart fpkt = new Flipkart();
		Courier courier = null;
		//create dependent class object based on given courier type
		if(courierType.equalsIgnoreCase("bDart"))
			 courier = new BlueDart();
		else if(courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else
			throw new IllegalArgumentException("invalid courier type");
		//set dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}
}
