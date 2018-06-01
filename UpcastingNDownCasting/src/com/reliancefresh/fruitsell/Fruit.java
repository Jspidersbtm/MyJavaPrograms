package com.reliancefresh.fruitsell;

public class Fruit {
	String color;
	int price;

	Fruit(String color, int price) {
		this.color = color;
		this.price = price;
	}

	void prepareJuice() {
		System.out.println("Use mixer crush and prepare Juice");
	}
}
