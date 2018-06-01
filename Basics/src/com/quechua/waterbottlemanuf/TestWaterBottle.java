package com.quechua.waterbottlemanuf;

public class TestWaterBottle {
	public static void main(String[] args) {
		WaterBottle w1 = new WaterBottle();
		WaterBottle w2 = new WaterBottle();
		WaterBottle w3 = new WaterBottle();

		System.out.println(w1.color);// purple
		w1.color = "Blue";
		w3.price = 500;
		System.out.println(w2.color);// purple
		System.out.println(w1.color);// blue
	}
}
