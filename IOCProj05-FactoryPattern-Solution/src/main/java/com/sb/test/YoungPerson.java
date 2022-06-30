package com.sb.test;

import com.sb.comp.*;
import com.sb.factory.CarFactory;

public class YoungPerson {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("sport", "KA38 MK 3333");
		car.driveCar();
		;

	}

}
