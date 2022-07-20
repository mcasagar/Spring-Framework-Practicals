package com.sb.singleton;

public class Printer {
	//static variable to hold reference of single object
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer :: 0-param private constructor");
	}
	
	//static factory method
	public static Printer getInstance() {
		 if(INSTANCE == null)
			 //singleton logic
			 INSTANCE = new Printer();
		 return INSTANCE;
	}
	
	//b.method
	public void print(String msg) {
		System.out.println(msg);
	}
	
}
