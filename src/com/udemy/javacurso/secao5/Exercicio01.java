package com.udemy.javacurso.secao5;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME UM NÚMERO INTEIRO QUALQUER: ");
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Negativo");
		} else if (x > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Nulo");
		}
		
	}

}
