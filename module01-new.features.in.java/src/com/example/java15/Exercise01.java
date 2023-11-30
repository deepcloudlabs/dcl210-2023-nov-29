package com.example.java15;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

record Person(String fullname,int age) {
	public Person {		
		if(age < 0)
			throw new IllegalArgumentException("Age cannot be negative");
	}
}