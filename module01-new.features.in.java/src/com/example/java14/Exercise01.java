package com.example.java14;

import java.util.List;

public class Exercise01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var point1 = new Point(1,2);
		var point2 = new Point(1,2);
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point1.equals(point2));
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());
		System.out.println(point1.x());
		System.out.println(point1.y());
		var list = List.of(new Point(1,2),new Point(3,4),new Point(5,6));
		Point []points= {new Point(1,2),new Point(3,4),new Point(5,6)};
		new A(); // 12-Byte (Object Header)+4-byte = 16Byte
		// 1|2|3|4|5|6
		int []points2 = {1,2,3,4,5,6};
	}

}

class A{}