package org.casio.calculatorapp;

public class Exchange {
	void convertRupeesToUSD(double rupees) {
		double USD = rupees / 64.8;
		double comm = USD * 0.03;
		double totalValue = USD - comm;
		System.out.println("The total conversion value is " + USD);
		System.out.println("The total commission is " + comm);
		System.out.println("Final dollars your get is " + totalValue);
	}

	public static void main(String[] args) {
		Exchange e = new Exchange();
		e.convertRupeesToUSD(156666);
	}
}
