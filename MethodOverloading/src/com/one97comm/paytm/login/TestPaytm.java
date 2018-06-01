package com.one97comm.paytm.login;

public class TestPaytm {

	public static void main(String[] args) {
		System.out.println("Opened paytm website");
		Paytm p = new Paytm();
		System.out.println("Trying to login");
		p.login(9876543210L, "alpha@123");
	}
}
