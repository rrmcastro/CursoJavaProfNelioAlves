package com.udemy.javacurso.secao8.application;

import java.util.Locale;
import java.util.Scanner;

import com.udemy.javacurso.secao8.entities.CurrencyConverter;

public class ProgramExFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		
		System.out.print("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cc.dollarQuantity = sc.nextDouble();
		
		//double dollarTotal = cc.dollarPrice * cc.dollarQuantity;
		
		
		
		System.out.printf("Ammount to be paid in Reais = %.2f", cc.dollarToReais());
		

	}

}
