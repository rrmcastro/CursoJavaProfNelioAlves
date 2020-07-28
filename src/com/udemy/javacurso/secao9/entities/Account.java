package com.udemy.javacurso.secao9.entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double ammount) {
			this.balance -= ammount + 5.0;
	}

	public void deposit(double ammount) {
		this.balance += ammount;
		System.out.println("Successful Deposit!");
		System.out.println("New balance: " + this.balance);
	}

	@Override
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}

}
