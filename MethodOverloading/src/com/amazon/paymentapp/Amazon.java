package com.amazon.paymentapp;

public class Amazon {
	Product pay(Wallet w) {
		System.out.println("Accepted payment using wallet");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}

	Product pay(CreditCard c) {
		System.out.println("Accepting payment using credit card");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}

	Product pay(DebitCard d) {
		System.out.println("Accepting payment using debit card");
		System.out.println("Product is packed");
		Product p = new Product();
		System.out.println("Delivering the product to the customer");
		return p;
	}
}