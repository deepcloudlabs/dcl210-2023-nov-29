package com.example.java15;

public class Exercise02 {

	public static void main(String[] args) {
		

	}

}

abstract sealed class Employee permits Manager,Engineer{}
sealed class Manager extends Employee permits Director{}
final class Director extends Manager {}
sealed class Engineer extends Employee permits SoftwareEngineer, CivilEngineer, AiEngineer{}
final class SoftwareEngineer extends Engineer {}
final class CivilEngineer extends Engineer {}
final class AiEngineer extends Engineer {}