package com.sb.beans;
//Spring bean class
public class Employee1 {
	//all bean properties are mandatory to participates in injection then go for constructor injection
	//constructor is good when all bean properties are mandatory to participate
	private int eno;
	private String ename;
	private String eadds;
	
	public Employee1(int eno, String ename, String eadds) {
		System.out.println("Employee1 :: 3-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.eadds = eadds;
	}

	@Override
	public String toString() {
		return "Employee1 [eno=" + eno + ", ename=" + ename + ", eadds=" + eadds + "]";
	}
	
	 
	
}
