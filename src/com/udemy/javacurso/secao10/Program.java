package com.udemy.javacurso.secao10;

import java.util.Scanner;

import com.udemy.javacurso.secao10.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean quartos[] = new boolean[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		Rent[] vect = new Rent[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			sc.nextLine();
			String email = sc.nextLine();
			sc.nextLine();
			int room = sc.nextInt();
			quartos[room] = true;
			vect[i] = new Rent(name, email, room);
		}
		
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i]) {
				//System.out.println(Rent);
			}
		}
		System.out.println();
		
		
		
		
		
	}

}
