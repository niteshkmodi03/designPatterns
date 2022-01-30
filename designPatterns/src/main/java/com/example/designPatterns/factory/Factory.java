package com.example.designPatterns.factory;

public class Factory {

	/*
	 * Most widely used patterns in JDK, Spring and struts.
	 * 
	 * Factory Design pattern is based on Encapsulation object oriented concept.
	 * 
	 * 
	 * Factory method is used to create different object from factory often refereed
	 * as Item and it encapsulate the creation code. So instead of having object
	 * creation code on client side we encapsulate inside Factory method in Java.
	 * 
	 * Encapsulate code of object creation instead of manually doing it
	 * 
	 * 
	 * When an interface is implemented by multiple interfaces, it is very hard to
	 * determine which class should be invoked at run time.
	 * 
	 * To mitigate this issue we came with a dynamic approach of object creation.
	 * 
	 */

	/*
	 * Advantages : 1. Static factory method used in factory design pattern enforces
	 * use of Interface than implementation which itself a good practice. for
	 * example: Map synchronizedMap = Collections.synchronizedMap(new HashMap());
	 * 
	 * Since static factory method have return type as Interface, it allows you to
	 * replace implementation with better performance version in newer release.
	 * 
	 * Another advantage of static factory method pattern is that they can cache
	 * frequently used object and eliminate duplicate object creation.
	 * Boolean.valueOf() method is good example which caches true and false boolean
	 * value.
	 * 
	 * Factory method pattern is also recommended by Joshua Bloch in Effective Java.
	 * 5 Factory method pattern offers alternative way of creating object.
	 * 
	 * 6. Factory pattern can also be used to hide information related to creation
	 * of object. /
	 */

	public static void main(String[] args) throws IllegalAccessException {

		Currency rupee = CurrencyFactory.createCurrency("India");
		System.out.println(rupee.getSymbol());

	}

}
