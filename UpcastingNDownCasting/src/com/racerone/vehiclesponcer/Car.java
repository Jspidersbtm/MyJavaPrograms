package com.racerone.vehiclesponcer;

public class Car extends Vehicle {
	public Car() {
		super("Red", "Ferrari", 6);
	}

	void activateNitrous() {
		System.out.println("Nitrous activated");
	}
}
