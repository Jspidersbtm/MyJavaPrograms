package org.casio.calculatorapp;

public class PetrolPump {
	void calculateAmountOfPetrol(double money) {
		double litres = money / 74.38;
		System.out.println("You get " + litres + " litres of Fuel");
	}

	public static void main(String[] args) {
		PetrolPump p = new PetrolPump();
		p.calculateAmountOfPetrol(1456.35);
	}
}
