//Constructor Injection
package com.sb.beans;

import java.util.Date;

public class WishMessegeGenerator {
	// HAS-A property (Supporting composition)
	private Date date;

	public WishMessegeGenerator(Date date) {
		System.out.println("WishMessegeGenerator :: 1-param constructor");
		this.date = date;
	}
	

	//business method
	public String generateMessege(String user) {
		System.out.println("WishMessegeGenerator.generateMessege()");
		//get current hour of the day
		int hour = date.getHours(); //24 hours format 0 to 23
		//generate message
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
