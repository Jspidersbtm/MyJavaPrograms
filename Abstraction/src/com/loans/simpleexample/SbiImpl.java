package com.loans.simpleexample;

public class SbiImpl implements ILoan {

	@Override
	public double calculateInterest(double principle, int years) {
		return principle * years * ILoan.RATE_OF_INTEREST / 100;
	}

	public static void main(String[] args) {
		ILoan i = new SbiImpl();
		System.out.println(i.calculateInterest(100000, 2));
	}
}
