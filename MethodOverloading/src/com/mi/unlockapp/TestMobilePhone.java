package com.mi.unlockapp;

public class TestMobilePhone {
	public static void main(String[] args) {
		System.out.println("Phone object is present");
		MobilePhone m = new MobilePhone();
		System.out.println("trying to unlock using phone");
		m.unlock(1234);
	}
}
