package com.cafeday.coffemachine;

import java.util.Random;

public class CoffeeMachine {
	Beverage giveBeverage() {
		Random r = new Random();
		int option = r.nextInt(3) + 1;
		// Scanner s = new Scanner(System.in);
		// System.out.println("Enter 1->cappuccino, 2->milk, 3->Tea");
		// int option = s.nextInt();
		switch (option) {
		case 1:
			Cappuccino c = new Cappuccino();
			return c;
		case 2:
			return new Milk();
		default:
			return new Tea();
		}
	}

	public static void main(String[] args) {
		CoffeeMachine c = new CoffeeMachine();
		Beverage b = c.giveBeverage();
		System.out.println("Received " + b);
	}

}
