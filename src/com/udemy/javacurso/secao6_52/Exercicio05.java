package com.udemy.javacurso.secao6_52;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fat = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

	}

}
