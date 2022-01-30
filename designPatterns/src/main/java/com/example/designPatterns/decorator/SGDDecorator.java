package com.example.designPatterns.decorator;

public class SGDDecorator extends Decorator {
	
//	Currency currency;

	SGDDecorator(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String getDescription() {
		return currency.getDescription() + "Singapure dollar";
	}

	@Override
	public double cost(double value) {
		return currency.cost(value) + 0.10;
	}

}
