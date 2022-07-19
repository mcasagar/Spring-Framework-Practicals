//WishMessageGenerator.java
package com.sb.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class WishMessegeGenerator {
	// HAS-A property (Supporting composition)
	@Autowired(required=true) //dependent spring bean class cnfg must be available
	private Date date;

	public WishMessegeGenerator() {
		System.out.println("WishMessegeGenerator :: 0-param constructor");
	}
	
	
	//business method
	public String generateMessege(String user) {
		System.out.println("WishMessegeGenerator.generateMessege()");
		//get current hour of the day
		int hour = date.getHours(); //24 hours format 0 to 23
		//generate messege
		if(hour<12)
			return "good Morning "+user;
		if(hour<16)
			return "Good Afternoon "+user;
		if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}//method
}//class
