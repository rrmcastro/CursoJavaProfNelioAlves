package com.udemy.javacurso.secao14_128.entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return (super.payment() + (additionalCharge * 1.1));
	}

}
