package com.bluestar.acmanufature;

public class TestAir {
	public static void main(String[] args) {
		System.out.println("Created air conditioner object");
		AirConditioner ac = new AirConditioner();
		System.out.println("Created water object");
		Water w = new Water();
		System.out.println("Fill airconditioner with water");
		Air a = ac.blow(w);
		System.out.println("Received air from the ac");
	}
}
