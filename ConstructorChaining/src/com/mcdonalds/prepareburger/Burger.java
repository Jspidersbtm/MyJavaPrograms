package com.mcdonalds.prepareburger;

public class Burger {
	String brand = "McDonalds";
	String type;
	int price;
	boolean isCheesy;

	Burger(String type, int price, boolean isCheesy) {
		this.type = type;
		this.price = price;
		this.isCheesy = isCheesy;
	}

	Burger(int price, boolean isCheesy) {
		this("Veg", price, isCheesy);
	}

	Burger(boolean isCheesy) {
		this(50, isCheesy);
	}

	@Override
	public String toString() {
		return "Burger [brand=" + brand + ", type=" + type + ", price=" + price + ", isCheesy=" + isCheesy + "]";
	}

	public static void main(String[] args) {
		Burger b = new Burger("non-veg", 200, false);
		System.out.println(b);
	}

}
