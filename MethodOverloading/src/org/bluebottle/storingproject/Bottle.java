package org.bluebottle.storingproject;

public class Bottle {

	void store(Water w) {
		System.out.println("Accepting water and storing");
	}

	void store(Milk m) {
		System.out.println(m.color); // white
		System.out.println("Accepting milk and storing");
	}

	void store(Juice j) {
		System.out.println("Accepting juice and storing");
	}
}