package com.csi.mousedesign;

public class DellImpl implements IMouse 
{

	@Override
	public void scrollUp() {
		System.out.println("Scroll up");
	}

	@Override
	public void scrollDown() {
		System.out.println("Scroll down");
	}

}
