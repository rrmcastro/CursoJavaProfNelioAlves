package com.udemy.javacurso.secao8.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8.entities.Rectangle;

public class ProgramEx01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
				
		System.out.printf("AREA =  %.2f%n", r1.area());
		System.out.printf("PERIMETER =  %.2f%n", r1.perimeter());
		System.out.printf("DIAGONAL =  %.2f%n", r1.diagonal());		
				
		sc.close();
	}

}
