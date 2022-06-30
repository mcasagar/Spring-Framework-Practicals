package com.sb.comp;

public class SportCar extends Car {
	String regNo;

	public SportCar(String regNo) {
		System.out.println("SportCar :: 1-param constructor");
		this.regNo = regNo;
	}
	
	@Override
	public void driveCar() {
		System.out.println("Driving Sport Car " +regNo);
		
	}
	
}
