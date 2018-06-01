package org.bluebottle.storingproject;

public class TestBottle {
	public static void main(String[] args) {
		System.out.println("Milk is present");
		Milk doodh = new Milk();
		System.out.println(doodh.color);
		System.out.println(doodh);
		System.out.println("Bottle is present");
		Bottle b = new Bottle();
		System.out.println("Storing the milk in the bottle");
		b.store(doodh);
		System.out.println("Completed");
	}
}
