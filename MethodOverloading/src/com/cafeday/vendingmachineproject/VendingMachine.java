package com.cafeday.vendingmachineproject;

public class VendingMachine {
	AppleJuice prepare(Apple a) {
		System.out.println("Received apple");
		System.out.println("Preparing the apple juice");
		AppleJuice aj = new AppleJuice();
		System.out.println("Returing apple juice");
		return aj;
	}

	ColdWater prepare(Water w) {
		System.out.println("Received water");
		System.out.println("decreasing the temperature of the water");
		ColdWater cw = new ColdWater();
		System.out.println("returning Cold water");
		return cw;
	}

	Coffe prepare(CoffeBean cb) {
		System.out.println("Recived coffe bean");
		System.out.println("Prepaing the coffe");
		Coffe c = new Coffe();
		return c;
	}
}
