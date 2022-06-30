package com.sb.factory;

import com.sb.comp.Car;
import com.sb.comp.BudgetCar;
import com.sb.comp.LuxoryCar;
import com.sb.comp.SportCar;

public class CarFactory {
	//Factory having factory pattern logic (Logic to create and return one of several related classes obj)
	public static Car createCar(String type, String regNo) {
		if(type.equalsIgnoreCase("sport"))
			return new SportCar(regNo);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else if(type.equalsIgnoreCase("luxory"))
			return new LuxoryCar(regNo);
		else
			throw new IllegalArgumentException("invalid car");
		
	}//main
}//class
