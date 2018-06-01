package com.racerone.vehiclesponcer;

public class Racer {
	void race() {
		RacerCommunity rc = new RacerCommunity();
		Vehicle v = rc.sponcer();
		if (v != null) {
			System.out.println(v.color + " " + v.brand + " " + v.noOfWheels);
			v.start();

			if (v instanceof Truck) {
				Truck t = (Truck) v;
				t.activateTurbo();
			} else if (v instanceof Car) {
				Car c = (Car) v;
				c.activateNitrous();
			}
		} else {
			System.out.println("No vehicle dont race");
		}

	}

	public static void main(String[] args) {
		Racer r = new Racer();
		r.race();

		// new Racer().race();
	}
}
