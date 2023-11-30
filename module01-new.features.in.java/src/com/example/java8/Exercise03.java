package com.example.java8;

public class Exercise03 {
	public static void main(String[] args) {

	}
}

interface I {
	default void fun() {}
}

interface J {
	default void fun() {}
}

class P implements I,J {

	@Override
	public void fun() {
		I.super.fun();
	}
	
}