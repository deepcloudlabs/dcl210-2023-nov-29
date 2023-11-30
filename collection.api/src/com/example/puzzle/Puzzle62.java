package com.example.puzzle;

import java.util.IdentityHashMap;

public class Puzzle62 {
	// -Djava.lang.Integer.IntegerCache.high=4096
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 42; // 4-byte
		Integer y = 42; // Object Header (12-Byte) + 4-byte = 16-byte 
		var map = new IdentityHashMap<Integer, String>();
		System.err.println(map.size());
		map.put(Integer.valueOf(108), "elma");  // 1
		map.put(108, "armut"); // 1
		Integer u = 549;
		var v = Integer.valueOf(549);
		map.put(u, "kiraz"); // 2
		map.put(u, "kavun"); // 3
		System.err.println(map.size()); // 3?
		// 2? 4?
		System.err.println(map.get(u));
		System.err.println(map.get(v));
		System.err.println(map.get(549));

	}

}
