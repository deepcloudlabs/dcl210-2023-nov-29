package com.example.java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Exercise01 {
	// Error:	var i = 42;
	public static void main(String[] args) throws URISyntaxException, IOException {
		var url = new URI("https://www.deepcloudlabs.com").toURL();
		var conn = url.openConnection();
		var reader = new BufferedReader(
		               new InputStreamReader(conn.getInputStream()));
		reader.lines().forEach(System.out::println);
		var myList = Arrays.asList("a", "b", "c");
		for (var element : myList) {
			System.out.println(element);
		}
		for (var i=0;i<10;++i) {
			
		}
	}

}
