package com.sb.test;
import com.sb.comp.*;
import com.sb.factory.CarFactory;
public class ProfessionalCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("Budget", "MH43 KK 2424");
		car.driveCar();

	}

}
