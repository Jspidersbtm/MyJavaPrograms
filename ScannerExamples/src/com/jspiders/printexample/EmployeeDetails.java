package com.jspiders.printexample;

import java.util.Scanner;

public class EmployeeDetails {
	String name;
	long mobileNo;
	String fatherName;
	String motherName;
	int age;
	String panNo;
	long adharNo;
	String address;
	int pinCode;
	String maritialStatus;
	long accountNo;

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", \nmobileNo=" + mobileNo + ", \nfatherName=" + fatherName
				+ ", \nmotherName=" + motherName + ", \nage=" + age + ", \npanNo=" + panNo + ", \nadharNo=" + adharNo
				+ ", \naddress=" + address + ", \npinCode=" + pinCode + ", \nmaritialStatus=" + maritialStatus + "]";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmployeeDetails e = new EmployeeDetails();
		System.out.println("Enter your name");
		e.name = s.nextLine();
		System.out.println("Enter your mobile number");
		e.mobileNo = s.nextLong();
		s.nextLine();
		System.out.println("Enter your father Name");
		e.fatherName = s.nextLine();
		System.out.println("Enter your mother name");
		e.motherName = s.nextLine();
		System.out.println("Enter your age");
		e.age = s.nextInt();
		System.out.println("Enter your panNo");
		e.panNo = s.next();
		System.out.println("Enter your Adhar No");
		e.adharNo = s.nextLong();
		s.nextLine();
		System.out.println("Enter your address");
		e.address = s.nextLine();
		System.out.println("Enter your pin code");
		e.pinCode = s.nextInt();
		System.out.println("Enter your Maritial status");
		e.maritialStatus = s.next();
		System.out.println("Enter your account number");
		e.accountNo = s.nextLong();
		System.out.println(e.toString());
		s.close();
	}
}
