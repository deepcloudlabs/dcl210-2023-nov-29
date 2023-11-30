package com.example.java7;

public class Exercise02 {

	public static void main(String[] args) {
		String weekDay = "wednesday";
		String message;
		switch(weekDay) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			message = "work hard!";
			break;
		case "saturday":
		case "sunday":
			message = "rest!";
			break;
		default:
			message = "unknown day!";			
		}
		System.out.println(message);
	}

}
