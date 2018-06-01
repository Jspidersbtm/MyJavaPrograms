package com.csi.mousedesign;

public class TestMouse {
	public static void main(String[] args) {
		IMouse i = new DellImpl();
		i.scrollUp();
		i.scrollDown();
	}
}
