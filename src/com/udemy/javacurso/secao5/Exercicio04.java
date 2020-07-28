package com.udemy.javacurso.secao5;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("HORA INÍCIO: ");
		int inicio = sc.nextInt();

		System.out.println("HORA FIM: ");
		int fim = sc.nextInt();
		
		int duracao;
		
		if (inicio > fim) {
			duracao = (24 - inicio) + fim;	
		} else {
			duracao = fim - inicio;
		}

		
		System.out.println("Duração: " + duracao);
	}

}
