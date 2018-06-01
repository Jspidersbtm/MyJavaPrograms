package com.loans.simpleexample;

public interface ILoan {
	double RATE_OF_INTEREST = 13.5;

	double calculateInterest(double principle, int years);
}