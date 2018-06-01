package org.casio.calculatorapp;

public class Calculator {

	int square(int num) {
		int res = num * num;
		return res;
	}

	int add(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

	int convertHourToMinute(int hour) {
		int minutes = hour * 60;
		return minutes;
	}

	int mul(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}

	int sub(int num1, int num2) {
		int res = num1 - num2;
		return res;
	}

	int div(int num1, int num2) {
		int res = num1 / num2;
		return res;
	}

	int cubeOfNumber(int num) {
		int res = num * num * num;
		return res;
	}

}