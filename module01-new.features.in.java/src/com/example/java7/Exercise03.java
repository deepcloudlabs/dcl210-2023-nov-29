package com.example.java7;

public class Exercise03 {

	public static void main(String[] args) {
		String weekDay = "wednesday";
		String message = switch(weekDay) {
			case "monday","tuesday","wednesday","thursday","friday" -> {
				yield "work hard!";
			}
			case "saturday","sunday"->{
				yield "rest!";
				
			}
			default -> {
				yield "unknown day!";			
				
			}
		};
		System.out.println(message);
	}

}
