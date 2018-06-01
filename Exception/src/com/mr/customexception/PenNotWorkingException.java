package com.mr.customexception;

public class PenNotWorkingException extends Exception {

	public PenNotWorkingException() {
		super("Pen not working replace it");
	}

	public PenNotWorkingException(String message) {
		super(message);
	}

}
