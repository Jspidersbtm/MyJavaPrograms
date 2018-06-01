package com.one97comm.paytm.login;

public class Paytm {
	void login(long phoneNumber, String password) {
		System.out.println("Logged in successfully using " + phoneNumber);
	}

	void login(String emailAddress, String password) {
		System.out.println("Logged in successfully using " + emailAddress);
	}
}
