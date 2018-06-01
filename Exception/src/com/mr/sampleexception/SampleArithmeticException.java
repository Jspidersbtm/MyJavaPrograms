package com.mr.sampleexception;

public class SampleArithmeticException {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		try {
			System.out.println(6 / 0); // throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			System.out.println("Number was divided by zero");
		}
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println(11);
		System.out.println("Successfully executed");
	}
}