package com.deepanshu.factoryPattern;

public class ClientCode {

	
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.createCars("Xuv");
		car.startEngine();
		 
	}
}
