package com.inheritance.basicphoneexample;

public class CollegeStudent extends Student {

	CollegeStudent(int id, String name) {
		super(id, name);
	}

	CollegeStudent() {
		super(1, "Alpha");
	}

	public static void main(String[] args) {
		CollegeStudent cs = new CollegeStudent(19, "Bruke");
		System.out.println(cs.name);
		System.out.println(cs.id);

		CollegeStudent cs1 = new CollegeStudent();
		System.out.println(cs1.id + " " + cs1.name);
	}

}
