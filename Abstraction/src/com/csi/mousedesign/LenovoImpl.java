package com.csi.mousedesign;

public class LenovoImpl implements IMouse {

	@Override
	public void scrollUp() {
		System.out.println("Lenovo scroll up");
	}

	@Override
	public void scrollDown() {
		System.out.println("lenovo scroll down");
	}

}
