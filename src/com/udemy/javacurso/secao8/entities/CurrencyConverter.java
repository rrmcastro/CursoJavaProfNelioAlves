package com.udemy.javacurso.secao8.entities;

public class CurrencyConverter {

	public double dollarPrice;
	public double dollarQuantity;
	public final double IOF = 1.06;
	
	public double dollarToReais() {
		return (dollarPrice * dollarQuantity) * IOF; 
	}
}
