package com.example.java17;

import java.util.Objects;

public class Exercise01 {
	public static int getNumberOfEdges(Shape shape) {
		// Pattern Matching
		return switch(shape) {
		  case Triangle t when Objects.nonNull(t) && t.getDimension()==2 -> 3;
		  case Rectangle r when Objects.nonNull(r) && r.getDimension()==2 -> 4;
		  case Square s when s.getDimension()==2 -> 4;
		  case Pentagon p when p.getDimension()==2 -> 5;
		  case Hexagon g when g.getDimension()==2 -> 6;
		  default -> 0;
		};
	}
	
	public static void main(String[] args) {
		var shape = new Pentagon();
		System.out.println(getNumberOfEdges(shape));

	}

}

interface Shape{
	default int getDimension() {return 2;}
}
class Triangle implements Shape {}
class Rectangle implements Shape {}
class Square implements Shape {}
class Pentagon implements Shape {}
class Hexagon implements Shape {}