package com.example.designPatterns.factory;

public class CurrencyFactory {

	public static Currency createCurrency(String country) throws IllegalAccessException {
		if(country.equalsIgnoreCase("India")) {
			return new Rupee();
		}else if(country.equalsIgnoreCase("USA")) {
			return new USDollar();
		}else if(country.equalsIgnoreCase("Singarpore")) {
			return new SGDDollar();
		}
		
		throw new IllegalAccessException("No Such Currency");
	}
}
