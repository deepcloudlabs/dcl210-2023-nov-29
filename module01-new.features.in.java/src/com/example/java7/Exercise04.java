package com.example.java7;

public class Exercise04 {

	public static void main(String[] args) {
		Account account = new Account("tr1", 1_000_000);
		try {
			account.withdraw(2_000_000);
		} catch (NegativeAmountException | DeficitException | ZeroAmountException e) { // multi-catch
			System.out.println("Error has occured while withdrawing money: %s".formatted(e.getMessage()));
		}

	}

}
