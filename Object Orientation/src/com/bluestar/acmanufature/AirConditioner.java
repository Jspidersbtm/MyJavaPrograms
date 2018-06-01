package com.bluestar.acmanufature;

public class AirConditioner {
	Air blow(Water w) {
		System.out.println("Accepting water");
		System.out.println("Generating air");
		Air a = new Air();
		System.out.println("Returning air");
		return a;
	}
}
