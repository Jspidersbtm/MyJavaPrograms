package com.mr.samplestringbuf;

public class Pan {
	String panNo;

	Pan(String panNo) {
		this.panNo = panNo;
		System.out.println(this.toString());
	}

	@Override
	public int hashCode() {
		return this.panNo.hashCode();
	}

	public static void main(String[] args) {
		new Pan("15648e");
		new Pan("78974e");
		new Pan("dfgh567");
		new Pan("7897455rt");
		new Pan("4556789y");
		new Pan("78974e");
		new Pan("dfgh567");
	}

}
