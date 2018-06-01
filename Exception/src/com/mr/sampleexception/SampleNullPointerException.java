package com.mr.sampleexception;

public class SampleNullPointerException {
	String name;

	public static void main(String[] args) {
		SampleNullPointerException s = new SampleNullPointerException();
		System.out.println(s.name);// null
		s.name = "alpha";
		try {
			System.out.println(s.name.toUpperCase());
		} catch (NullPointerException ne) {
			System.out.println("Performing operation on null change it");
		}
		System.out.println("Successfully completed execution");
	}
}
