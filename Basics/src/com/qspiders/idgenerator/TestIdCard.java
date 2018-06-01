package com.qspiders.idgenerator;

public class TestIdCard {
	public static void main(String[] args) {
		IdCard i1 = new IdCard();
		System.out.println(i1); // com.qspiders.idgenerator.IdCard@15db9742
		System.out.println(i1.name + " " + i1.mobileNumber + " " + i1.branch);
		// null 0 null
		i1.name = "Alpha";
		i1.mobileNumber = 9876543210L;
		i1.branch = "S_BTM";
		System.out.println(i1.name + "  " + i1.mobileNumber + " " + i1.branch);
		// Alpha 9876543210 S_BTM

		IdCard i2 = new IdCard();
		
	}
}
