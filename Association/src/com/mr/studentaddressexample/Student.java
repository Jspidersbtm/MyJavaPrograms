package com.mr.studentaddressexample;

public class Student {
	String name;
	int age;
	String gender;
	Address address;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

}
