package com.example.designPatterns.decorator;

public class CurrencyCheck {

	public static void main(String[] args) {

		Currency curr = new Dollar();
		
	//	System.out.println(curr.getCurrencyDescription() + " dollar. " + curr.cost(2.0));
		
		curr = new USDDecorator(curr);
		
	//	System.out.println(curr.getCurrencyDescription() + " dollar. " + curr.cost(2.0));
		
		curr = new USDDecorator(curr);
		
	//	System.out.println(curr.getCurrencyDescription() + " dollar. " + curr.cost(2.0));
		
		curr = new SGDDecorator(curr);

		System.out.println(curr.getDescription() + " dollar. " + curr.cost(2.0));

		/*Currency curr2 = new USDDecorator(new Dollar());

		System.out.println(curr2.getCurrencyDescription() + " dollar. " + curr2.cost(2.0));

		Currency curr3 = new SGDDecorator(new Dollar());

		System.out.println(curr3.getCurrencyDescription() + " dollar. " + curr3.cost(4.0));*/
	}

}
