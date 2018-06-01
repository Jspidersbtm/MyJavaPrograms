package com.mr.sampleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleInputMisMatch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = 0;
		try {
			age = s.nextInt();
		} catch (InputMismatchException ie) {
			System.out.println("Entered an invalid age");
		} finally {
			s.close();
		}
		System.out.println(age);
		System.out.println("Successfully completed");
	}
}
