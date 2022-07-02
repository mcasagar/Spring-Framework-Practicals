package com.sb.beans;

public class Student {
	//let us assume bean properties are optional to provide for defendency injection
	//setter injection is good when bean properties are optional to participate
	private String sname;
	private String collegeName;
	private int age;
	private String qlfy;
	
	public Student() {
		System.out.println("Student :: 0-param constructor");
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", collegeName=" + collegeName + ", age=" + age + ", qlfy=" + qlfy + "]";
	}
	
	 
	
	
}
