package com.reliancefresh.fruitsell;

public class Lemon extends Fruit {
	public Lemon() {
		super("Yellow", 5);
	}

	void prepareJuice() {
		System.out.println("Squeeze and prepare juice");
	}
}
