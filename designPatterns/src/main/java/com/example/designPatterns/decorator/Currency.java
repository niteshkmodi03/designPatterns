package com.example.designPatterns.decorator;

public abstract class Currency {
	
	String description = "Unknown currency";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost(double value);

}
