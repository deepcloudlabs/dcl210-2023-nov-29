package com.example.summary;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise02 {
	public static void main(String[] args) {
		 double mean = Stream.of(1, 2, 3, 4, 5)
			      .collect(
			        Collectors.teeing(Collectors.summingDouble(Double::valueOf), 
			        Collectors.counting(), 
			        (sum, count) -> sum / count)
			       );
		 System.out.println(mean);	
		 String multilineString = "Quantum computing is a type of computation\n whose operations can harness the phenomena of quantum mechanics,\n such as superposition, interference, and entanglement. ";
		 List<String> lines = multilineString.lines()
		   .filter(line -> !line.isBlank())
		   .map(String::strip)
		   .collect(Collectors.toList());
		 lines.forEach(System.out::println);
	}
}
