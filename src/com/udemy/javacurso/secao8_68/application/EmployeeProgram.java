package com.udemy.javacurso.secao8_68.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8_68.entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee e1 = new Employee(name, grossSalary, tax);
		
		System.out.println("\nEmployee: " + e1);
		
		System.out.print("\nWhich percentage to increase salary? ");
		e1.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated: " + e1);

	}

}
