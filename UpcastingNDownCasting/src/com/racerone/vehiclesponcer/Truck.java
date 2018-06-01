package com.racerone.vehiclesponcer;

public class Truck extends Vehicle {

	public Truck() {
		super("Brown", "Volvo", 8);
	}

	void activateTurbo() {
		System.out.println("Turbo activated");
	}
}