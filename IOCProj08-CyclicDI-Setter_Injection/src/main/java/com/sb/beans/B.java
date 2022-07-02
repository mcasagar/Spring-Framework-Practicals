package com.sb.beans;

public class B {
	private A a;
	
	public B() {
		System.out.println("B :: 0-param constructor");
	}

	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		//return "B [a=" + a + "]"; //stack overflow error - bcoz of toString() call (this line making our code recursive)
		return "B[a=]";
	}
	
	
	
	
}
