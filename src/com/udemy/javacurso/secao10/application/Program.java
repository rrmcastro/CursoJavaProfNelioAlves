package com.udemy.javacurso.secao10.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao10.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			sc.nextLine();
			String email = sc.nextLine();
			sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
				
		sc.close();

	}

}
