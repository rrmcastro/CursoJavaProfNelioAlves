package com.udemy.javacurso.secao8_68.entities;

public class Student {

	private String name;
	private double grade1;
	private double grade2;
	private double grade3;

	public Student(String name, double grade1, double grade2, double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public double Media() {
		return (grade1  + grade2 + grade3);
	}

	public String Aprovado() {
		if (Media() >= 60) {
			return "\nPASS";
		} else {
			return "\nFAILED" + 
					"\nMISSING " + (60 - Media()) + " POINTS";
		}
	}

	@Override
	public String toString() {
		return "FINAL GRADE = " + Media() + 
				Aprovado();
	}

}
