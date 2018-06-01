package com.racerone.vehiclesponcer;

import java.util.Scanner;

public class RacerCommunity {

	public Vehicle sponcer() {
		System.out.println("What vehicle you want?");
		String name = new Scanner(System.in).next();
		if (name.equalsIgnoreCase("Car")) {
			return new Car();
		} else if (name.equalsIgnoreCase("Bike")) {
			return new Bike();
		} else if (name.equalsIgnoreCase("Truck")) {
			return new Truck();
		} else {
			return null;
		}
	}

}
