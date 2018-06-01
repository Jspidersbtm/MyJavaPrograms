package com.inheritance.basicphoneexample;

public class Phone {
	String brand;
	String color;
	int price;
	
	Phone(){
		System.out.println("Phone class constructor");
	}

	void call() {
		System.out.println("Call");
	}

	void sms() {
		System.out.println("SMS");
	}
}
