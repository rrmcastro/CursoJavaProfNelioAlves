package com.udemy.javacurso.secao6_52;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double sum = 0;

		for (int i = 0; i < n; i++) {
			sum += (0.2 * sc.nextDouble());
			sum += (0.3 * sc.nextDouble());
			sum += (0.5 * sc.nextDouble());

			/*
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			sum = ((valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5));
			 */
			
			System.out.printf("%.1f", sum);
			sum = 0;
		}

	}

}
