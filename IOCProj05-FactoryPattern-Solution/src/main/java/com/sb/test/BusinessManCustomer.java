package com.sb.test;

import com.sb.comp.*;
import com.sb.factory.CarFactory;

public class BusinessManCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("luxory", "MH19 KH 8989");
		car.driveCar();
			
	}

}
