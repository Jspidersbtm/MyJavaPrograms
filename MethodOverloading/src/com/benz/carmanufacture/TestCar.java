package com.benz.carmanufacture;

public class TestCar {

	public static void main(String[] args) {
		System.out.println("Creating a car object");
		Car c = new Car();
		System.out.println("Creating a petrol object");
		Petrol p = new Petrol();
		System.out.println("Filling the car with petrol");
		Smoke s = c.fill(p);
		System.out.println("received smoke");
	}
}
