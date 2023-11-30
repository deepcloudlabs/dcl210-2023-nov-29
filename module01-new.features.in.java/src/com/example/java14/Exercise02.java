package com.example.java14;

public class Exercise02 {

	public static void main(String[] args) {
		Animal animal = new Spider();
		if (animal instanceof Pet pet) {
			// Pet pet = (Pet) animal;
			pet.play();
		}
	}

}

abstract class Animal {
}

interface Pet {
	void play();
}

class Spider extends Animal {
}

class Cat extends Animal implements Pet {

	@Override
	public void play() {
		System.err.println("Cat is playing...");
	}
}