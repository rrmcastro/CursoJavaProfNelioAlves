package com.udemy.javacurso.secao8.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8.entities.Employee;

public class ProgramEx02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		e1.name = sc.nextLine();
		System.out.print("Gross salary: ");
		e1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e1.tax = sc.nextDouble();
		
		System.out.println(e1);
		
		System.out.print("\nWhich percentage to increase salary? ");
		
		e1.IncreaseSalary(sc.nextDouble());
		
		
		
		
		
		
		
	}

}
