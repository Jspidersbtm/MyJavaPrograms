package com.mr.studentaddressexample;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "*";
		s.age = 24;
		s.gender = "Female";
		s.address = new Address();
		s.address.doorNo = 5;
		s.address.city = "Bangalore";
		s.address.street = "BTM";
		s.address.pincode = 560087;
		System.out.println(s);
	}
}
