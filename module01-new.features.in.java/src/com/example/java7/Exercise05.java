package com.example.java7;

public class Exercise05 {
	public static void fun() throws ExceptionA, ExceptionB, ExceptionC {
		try {
			gun();
		} catch (Exception e) {
			System.out.println("Error has occured: %s".formatted(e.getMessage()));
			throw e;
		}

	}

	public static void gun() throws ExceptionA, ExceptionB, ExceptionC {
	}

	public static void main(String[] args) {

	}
}

@SuppressWarnings("serial")
class ExceptionA extends Exception {
}

@SuppressWarnings("serial")
class ExceptionB extends Exception {
}

@SuppressWarnings("serial")
class ExceptionC extends Exception {
}