package org.casio.calculatorapp;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int minutes = c.convertHourToMinute(48);
		System.out.println(minutes);
	}

}
