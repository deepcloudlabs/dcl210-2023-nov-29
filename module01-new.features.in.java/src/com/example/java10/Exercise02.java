package com.example.java10;

import java.util.List;

public class Exercise02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var numbers1 = List.of(4,8,15,16,23); // List<Integer>
		var numbers2 = List.of(4,8,15,16,23.); // List<Number & Comparable<?>>
		List<Number> numbers3 = List.of(4,8,15,16,23.); // List<Object & Comparable<?> & Serializable>
        var x = 42;

	}

}
