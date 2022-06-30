package com.sb.comp;

public class LuxoryCar extends Car {
	private String regNo;
	
	public LuxoryCar(String regNo) {
		System.out.println("LuxoryCar :: 1-param constructor");
		this.regNo = regNo;
	}
	
	@Override
	public void driveCar() {
		System.out.println("Driving Luxory Car "+ regNo);
		
	}
	
}
