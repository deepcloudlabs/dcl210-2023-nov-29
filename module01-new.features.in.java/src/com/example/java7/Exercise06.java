package com.example.java7;

public class Exercise06 {

	public static void main(String[] args) {
		try(
			var res1= new MyResource(1);
			var res2= new MyResource(2);
			var res3= new MyResource(3);
		){
			throw new Exception("Ooopsss");
		}catch (Exception e) {
			System.err.println(e.getMessage());
			for(Throwable t: e.getSuppressed())
				System.err.println("Error while closing the resource: %s.".formatted(t.getMessage()));
			return;
		}

	}

}