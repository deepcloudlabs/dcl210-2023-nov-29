package com.example.java7;

public class Account {
	private String iban;
	private double balance;

	public Account(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
	}

	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws NegativeAmountException, DeficitException, ZeroAmountException {
		if (amount < 0.0)
			throw new NegativeAmountException("You cannot withdraw negative amount.");
		if (amount == 0.0)
			throw new ZeroAmountException("You cannot withdraw zero amount.");
		if (amount > balance)
			throw new DeficitException("Your expenses are too high!");
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance + "]";
	}

}
