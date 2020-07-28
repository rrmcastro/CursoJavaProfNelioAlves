package com.udemy.javacurso.secao6_52;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		
		int in = 0;
		int out = 0;
		int n;
		
		for (int i = 0; i < quantidade; i++) {
			n = sc.nextInt();
			if (n >= 10 && n <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
