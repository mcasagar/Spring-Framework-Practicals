package com.sb.beans;

public class A {
	private B b;
	
	public A(B b) {
		this.b = b;
		System.out.println("A :: 1-param constructor");
	}

	@Override
	public String toString() {
		//return "A [b=" + b + "]";  //stack overflow error - bcoz of toString() call (this line making our code recursive)
		return "A[b=]";
	}
	
	
}
