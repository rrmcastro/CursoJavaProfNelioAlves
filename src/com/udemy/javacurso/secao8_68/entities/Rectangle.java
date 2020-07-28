package com.udemy.javacurso.secao8_68.entities;

public class Rectangle {

	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return ((2 * width) + (2 * height));
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}

	@Override
	public String toString() {
		return "AREA = " + area() + 
				"\nPERIMETER = " + perimeter() + 
				"\nDIAGONAL = " + diagonal();
	}
	
	
}
