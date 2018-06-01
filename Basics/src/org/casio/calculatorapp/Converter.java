package org.casio.calculatorapp;

public class Converter {
	double convertDegreeCelcuiusToFah(double celcius) {
		double farenhiet = celcius * 1.8 + 32;
		return farenhiet;
	}

	double convertFahToDegreeCelcuius(double fah) {
		double celcius = (fah - 32) / 1.8;
		return celcius;
	}

	public static void main(String[] args) {
		Converter c = new Converter();
		double fah = c.convertDegreeCelcuiusToFah(38);
		System.out.println(fah);
		System.out.println(c.convertFahToDegreeCelcuius(100.4));
	}
}
