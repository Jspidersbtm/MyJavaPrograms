package com.reliancefresh.fruitsell;

import java.util.Random;

public class Shop {
	String name;

	Shop(String name) {
		this.name = name;
	}

	public Fruit sell() {
		Random r = new Random();
		int n = r.nextInt(4) + 1;
		switch (n) {
		case 1:
			return new Lemon();

		case 2:
			return new Apple();

		case 3:
			return new Mango();

		default:
			return null;
		}

	}

}
