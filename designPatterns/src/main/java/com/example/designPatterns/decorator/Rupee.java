package com.example.designPatterns.decorator;

public class Rupee extends Currency {

	double value;

	public Rupee() {
		description = "Indian Rupees";
	}

	@Override
	public double cost(double value) {
		this.value = value;
		return this.value;
	}

}
