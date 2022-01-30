package com.example.designPatterns.decorator;

public class USDDecorator extends Decorator {

//	Currency currency;
	
	public USDDecorator(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String getDescription() {
		return currency.getDescription() + "US Dollar";
	}

	@Override
	public double cost(double value) {
		return currency.cost(value) + 0.20;
	}

}
