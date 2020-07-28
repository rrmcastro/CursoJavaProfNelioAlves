package com.udemy.javacurso.secao8_68.entities;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;

	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double NetSalary() {
		return (grossSalary - tax);
	}

	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * percentage / 100);
	}

	@Override
	public String toString() {
		return (name + ", $ " + NetSalary());
	}

}
