package com.udemy.javacurso.secao8.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * (percentage / 100));
		System.out.printf("\nUpdated data: " + name + ", $ %.2f", NetSalary());
	}
	
	public String toString() {
		return "\nEmployee: " + name
			+ ", $ "
			+ String.format("%.2f", NetSalary());
			}
}
