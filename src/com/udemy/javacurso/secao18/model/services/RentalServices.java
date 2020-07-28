package com.udemy.javacurso.secao18.model.services;

import com.udemy.javacurso.secao18.model.entities.CarRental;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxServices taxService;

	public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	//public void processInvoice(CarRental carRental) {
	//	long
	//}
	
	
}
