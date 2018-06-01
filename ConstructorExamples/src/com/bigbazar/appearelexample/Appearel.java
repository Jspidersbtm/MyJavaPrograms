package com.bigbazar.appearelexample;

public class Appearel {
	String type;
	String color;
	char size;

	Appearel(String type, String color, char size) {
		this.type = type;
		this.color = color;
		this.size = size;
	}

	Appearel(String type, char size) {
		this.type = type;
		this.size = size;
		this.color = "Black";
	}

	void showDetail() {
		System.out.println(this.type + " " + this.color + " " + this.size);
	}

	public static void main(String[] args) {
		Appearel a1 = new Appearel("Jeans", "Blue", 'M');
		a1.showDetail();

		Appearel a2 = new Appearel("T shirt", "Red", 'S');
		a2.showDetail();

		// Appearel a3 = new Appearel();
		Appearel a3 = new Appearel("Shirt", 'S');
		a3.showDetail();

	}

}
