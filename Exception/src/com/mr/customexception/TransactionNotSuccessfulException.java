package com.mr.customexception;

public class TransactionNotSuccessfulException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7545929453433273799L;

	public TransactionNotSuccessfulException() {
		super("Transaction failed!");
	}

	public TransactionNotSuccessfulException(String message) {
		super(message);
	}

}
