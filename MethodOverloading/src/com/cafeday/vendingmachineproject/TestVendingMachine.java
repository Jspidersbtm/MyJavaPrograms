package com.cafeday.vendingmachineproject;

public class TestVendingMachine {
	public static void main(String[] args) {
		System.out.println("Bought new Vending machine");
		VendingMachine vm = new VendingMachine();
		System.out.println("Apple is present");
		Apple a = new Apple();
		System.out.println("Giving apple to the vending machine to prepare juice");
		AppleJuice aj = vm.prepare(a);
		System.out.println("received apple juice");
	}
}
