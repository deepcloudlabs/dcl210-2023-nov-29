package com.example.java7;

@SuppressWarnings("serial")
public class ZeroAmountException extends Exception {

	public ZeroAmountException(String message) {
		super(message);
	}

}
