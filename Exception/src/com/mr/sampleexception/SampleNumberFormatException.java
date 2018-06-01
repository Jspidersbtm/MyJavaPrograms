package com.mr.sampleexception;

public class SampleNumberFormatException {
	public static void main(String[] args) {
		String num = "152.265655";
		int n = 0;
		try {
			n = Integer.parseInt(num);
			System.out.println(n);
			System.out.println("Successfully converted from string to integer");
		} catch (NumberFormatException ne) {
			System.out.println("Not a proper number to convert");
		}
		System.out.println("Successfully terminated the program");
	}
}
