package com.udemy.javacurso.secao8_68.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8_68.entities.Student;

public class StudentProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		String name = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		
		Student s1 = new Student(name, grade1, grade2, grade3);
		
		System.out.println(s1);

	}

}
