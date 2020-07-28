package com.udemy.javacurso.secao4;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		
		int y;
		y = sc.nextInt();
		
		double z;
		z = sc.nextDouble();
		
		String w;
		w = sc.nextLine();
		
		System.out.println("Você digitou: " + x + " " + y + " " + z + " " + w);
		
		sc.close();
		
		
	}

}
