package com.racerone.vehiclesponcer;

public class Vehicle {
	String color;
	String brand;
	int noOfWheels;

	Vehicle(String color, String brand, int noOfWheels) {
		this.color = color;
		this.brand = brand;
		this.noOfWheels = noOfWheels;
	}

	void start() {
		System.out.println("Turn the key to start");
	}
}
