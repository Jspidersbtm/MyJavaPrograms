package com.zoo.personexample;

public class Person {
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Animal";
	}

	public static void main(String[] args) {
		Person a = new Person();
		System.out.println(a);
	}
}
