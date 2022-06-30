package com.sb.comp;


public class BudgetCar extends Car {
	String regNo;
	
	public BudgetCar(String regNo) {
		System.out.println("BudgetCar :: 1-param constructor");
		this.regNo = regNo;
	}
	@Override
	public void driveCar() {
		System.out.println("Driving Budget Car "+regNo);
	}
}
