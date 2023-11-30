package com.example.java8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Exercise02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Business business= new Business(); // object
		int[] numbers = { 4, 8, 15, 16, 23, 42 };
		IntPredicate isEven = Fun::isEven; // method reference
        int sum = Arrays.stream(numbers)
              //.filter(value -> value%2 == 0)
              .filter(isEven) // method reference
			  .map(Fun::cubed)
			  .sum();
        System.out.println("sum: %d".formatted(sum));
	}

}

interface Fun {
	void fun();
	default void gun() {
		sun();
	}; // since java 8
	public static boolean isEven(int value) { // since java 8
		return mod(value,2) == 0;
	}
	public static int cubed(int z) { // since java 8
		return z*z*z;
	}
	private static int mod(int u,int v) { // since java 9
		return u%v;
	}
	private void sun() {} // since java 9
}

class Business implements Fun {

	@Override
	public void fun() { }
	
}