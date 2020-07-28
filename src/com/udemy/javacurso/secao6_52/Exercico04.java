package com.udemy.javacurso.secao6_52;

import java.util.Scanner;

public class Exercico04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			if (n2 == 0) {
				System.out.println("divisão impossível");
			} else {
				System.out.println((double) n1 / n2);
			}
		}

	}

}
