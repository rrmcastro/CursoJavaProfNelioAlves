package com.udemy.javacurso.secao8.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product p1 = new Product(name, price, quantity);
		
		p1.setName("Computer");
		System.out.println();
		System.out.println("Updated name: " + p1.getName());
		p1.setPrice(1200);
		System.out.println();
		System.out.println("Updated price: " + p1.getPrice());
		
		System.out.println();
		System.out.print("Product data: " + p1);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p1.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + p1);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p1.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + p1);
				
		sc.close();
	}

}
