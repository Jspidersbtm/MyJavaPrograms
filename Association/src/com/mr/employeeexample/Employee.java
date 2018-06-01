package com.mr.employeeexample;

public class Employee {
	int age;
	String gender;
	int yearOfJoining;
	Address addr = new Address();
	BankAccount ba;
	Name name = new Name();
	Pan p;

	@Override
	public String toString() {
		return "Hello, " + this.name.firstName + " " + this.name.lastName + "! \nyou are " + this.gender
				+ " joined in the year " + this.yearOfJoining + " and \nyour pan details are updated as "
				+ this.p.nameOnCard + " " + this.p.panNo + " and \nyour address is " + this.addr.doorNo + " "
				+ this.addr.street + " " + this.addr.city + " and \nyour bank account details is " + this.ba.accNo + " "
				+ this.ba.ifscCode + " " + this.ba.type;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.age = 25;
		e.gender = "Male";
		e.yearOfJoining = 2016;

		e.name.firstName = "Micheal";
		e.name.lastName = "Stuart";

		e.addr.doorNo = 45;
		e.addr.street = "BTM";
		e.addr.city = "Bangalore";

		Pan p = new Pan();
		p.nameOnCard = e.name.firstName + " " + e.name.lastName;
		p.panNo = "BDFDF655S0";

		e.p = p;

		e.ba = new BankAccount();
		e.ba.accNo = 456_77_6587_4L;
		e.ba.ifscCode = "CITI0000003";
		e.ba.type = "Savings";

		System.out.println(e);
	}

}
