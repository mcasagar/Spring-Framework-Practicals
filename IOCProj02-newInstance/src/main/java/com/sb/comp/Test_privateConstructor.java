package com.sb.comp;

public class Test_privateConstructor {
	private int a = 10;
	private String b ="Hello";
	
	private Test_privateConstructor() {
		System.out.println("Test :: 0-param constructor");
	}
	
	private Test_privateConstructor(int a, String b) {
		System.out.println("Test :: 2-param constructor");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	
}
