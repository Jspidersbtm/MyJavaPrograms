package com.mr.customexception;

import java.io.IOException;

public class Student {
	void write() throws PenNotWorkingException, IOException {
		System.out.println("Writes 100 lines");
		System.out.println("Writes 200 lines");
		System.out.println("Writes 300 lines");
		System.out.println("Writes 400 lines");
		System.out.println("Writes 500 lines");
		throw new PenNotWorkingException();
	}

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.write();
		} catch (PenNotWorkingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully completed execution");
	}
}
