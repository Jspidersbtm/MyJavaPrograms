package com.racerone.vehiclesponcer;

public class Bike extends Vehicle {
	public Bike() {
		super("Black", "BMW", 2);
	}

	@Override
	void start() {
		System.out.println("Kick to start");
	}
}
