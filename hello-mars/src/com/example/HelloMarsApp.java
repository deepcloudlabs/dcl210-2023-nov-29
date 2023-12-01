package com.example;

import java.util.concurrent.TimeUnit;

public class HelloMarsApp {

	public static void main(String[] args) throws InterruptedException {
		System.err.println("HelloMarsApp is running...");
		TimeUnit.DAYS.sleep(30);
		System.err.println("HelloMarsApp is running...done.");
	}

}
