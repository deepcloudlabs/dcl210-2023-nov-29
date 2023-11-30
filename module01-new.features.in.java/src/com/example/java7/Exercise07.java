package com.example.java7;

import java.io.IOException;

public class Exercise07 {

	public static void main(String[] args) {
		var res1= new MyResource(1);
		var res2= new MyResource(2);
		var res3= new MyResource(3);
		try{
			return;
		}catch (Exception e) {
			return;
		}finally {
			try {
				res1.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					res2.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				} finally {
					try {
						res3.close();
					} catch (IOException e) {
						System.err.println(e.getMessage());
					}					
				}
			}
		}

	}

}

class MyResource implements AutoCloseable{
	private final int id;

	public MyResource(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public void close() throws IOException {
		System.err.println("Closing the resource %d.".formatted(id));
		throw new IOException("Cannot close the resource %d.".formatted(id));		
	}
	
}