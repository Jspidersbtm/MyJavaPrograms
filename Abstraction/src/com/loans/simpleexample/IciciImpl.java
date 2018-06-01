package com.loans.simpleexample;

public class IciciImpl implements ILoan {

	@Override
	public double calculateInterest(double principle, int years) {
		return principle * years * ILoan.RATE_OF_INTEREST / 100;
	}

}
