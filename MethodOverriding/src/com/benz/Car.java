package com.benz;

public class Car {
	int price;

	Car(int price) {
		this.price = price;
	}

//	public String toString() {
//		return "Car price is " + this.price;
//	}

	public static void main(String[] args) {
		Car c = new Car(2000000);
		System.out.println(c.toString()); // Car price is 2000000

		Car c2 = new Car(5000000);
		System.out.println(c2); // Car price is 5000000

		System.out.println(Integer.toHexString(10));
	}
}
