package com.udemy.javacurso.secao8_68.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8_68.entities.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
				
		Rectangle r1 = new Rectangle(width, height);
		
		System.out.println(r1);
		

	}

}
