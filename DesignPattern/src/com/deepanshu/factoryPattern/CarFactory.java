package com.deepanshu.factoryPattern;

public class CarFactory {

	// method to create the object

	public static Car createCars(String carType) {

		if (carType.equalsIgnoreCase("Sedan")) {
			return createSedan();
		}
		if (carType.equalsIgnoreCase("Xuv")) {
			return new Xuv();

		} else
			return new Truck();

	}
	
	private static Sedan createSedan() {
		return new Sedan();
	}

}
