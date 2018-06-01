package com.benz.carmanufacture;

public class Car {
	Smoke fill(Petrol p) {
		System.out.println("Accepting petrol");
		System.out.println("Generating smoke");
		Smoke s = new Smoke();
		System.out.println("Return smoke");
		return s;
	}

	Smoke fill(Diesel d) {
		System.out.println("Accepting Diesel");
		System.out.println("Generating smoke");
		Smoke s = new Smoke();
		System.out.println("Return smoke");
		return s;
	}

	Smoke fill(Gasoline g) {
		System.out.println("Accepting Gasoline");
		System.out.println("Generating smoke");
		Smoke s = new Smoke();
		System.out.println("Return smoke");
		return s;
	}
}
