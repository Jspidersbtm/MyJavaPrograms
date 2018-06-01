package com.rollsroyce.customcar;

public class Car {
	String brand = "Rolls Royce";
	String typeOfEngine;
	String color;
	int price;

	Car() {
		this("Petrol", "Black", 15000000);
		// this.color = "Black";
		// this.price = 15000000;
		// this.typeOfEngine = "Petrol";
	}

	Car(String typeOfEngine, String color, int price) {
		this.typeOfEngine = typeOfEngine;
		this.color = color;
		this.price = price;
	}

	Car(String typeOfEngine, String color) {
		this(typeOfEngine, color, 25000000);
		// this.typeOfEngine = typeOfEngine;
		// this.color = color;
		// this.price = 25000000;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", typeOfEngine=" + typeOfEngine + ", color=" + color + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1);
		Car c2 = new Car("Diesel", "white");
		System.out.println(c2); // Diesel white 250000000 Rolls Royce
	}
}
