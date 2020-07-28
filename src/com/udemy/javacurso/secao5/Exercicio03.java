package com.udemy.javacurso.secao5;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("INFORME VALOR PARA A: ");
		int A = sc.nextInt();
			
		System.out.println("INFORME VALOR PARA B: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Números múltiplos");
		} else {
			System.out.println("Números não múltiplos");
		}
		
		sc.close();
		
	}

}
