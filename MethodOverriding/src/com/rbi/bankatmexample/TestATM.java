package com.rbi.bankatmexample;

public class TestATM {
	public static void main(String[] args) {
		CitiAtm c = new CitiAtm();
		c.withDraw();
		System.out.println("_________________________________");
		MaheshATM m = new MaheshATM();
		m.withDraw();
	}
}
