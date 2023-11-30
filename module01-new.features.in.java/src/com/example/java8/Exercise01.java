package com.example.java8;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class Exercise01 {

	public static void main(String[] args) {
		int[] numbers = { 4, 8, 15, 16, 23, 42 };
        int sum = Arrays.stream(numbers)
              .filter(new IntPredicate() {
				
				@Override
				public boolean test(int value) {
					return value%2 == 0;
				}
			}).map(new IntUnaryOperator() {
				
				@Override
				public int applyAsInt(int x) {
					return x*x*x;
				}
			}).sum();
        System.out.println("sum: %d".formatted(sum));
	}

}
