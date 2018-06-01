package com.sangeetha.mobileexample;

public class TestPhone {
	public static void main(String[] args) {
		Samsung s = new Pro();
		if (s instanceof Galaxy) {
			Galaxy g = (Galaxy) s;
			g.shakePhone();
			g.faceRecognition();
		} else if (s instanceof Pro) {
			Pro p = (Pro) s;
			p.infrared();
			p.shakePhone();
		}
	}
}
