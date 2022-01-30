package com.example.designPatterns.decorator;

public abstract class Decorator extends Currency {
	
	Currency currency;

	/*What is decorator pattern
	 * Enhance the functionality of a particular object at run-time or dynamically.
	 * Other instance of same class will not be affected by this so individual
	 * object gets the new behavior.
	 * 
	 * Basically we wrap the original object through decorator object. · Decorator
	 * design pattern is based on abstract classes and we derive concrete
	 * implementation from that classes, · It’s a structural design pattern and most
	 * widely used.
	 * 
	 */
	
	/*When to use
	 * 
	 * When sub classing is become impractical and we need large number of different possibilities to make independent object or we can say we 
	 * have number of combination for an object.
	 * 
	 * Secondly when we want to add functionality to individual object not to all object at run-time we use decorator design pattern.
	 * */
	
	public abstract String getDescription();

}
