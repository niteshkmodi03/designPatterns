package com.example.designPatterns.abstractDemo;

public abstract class AbstractClassA {
	
	public int i;
	
	public static int j;
	
	public final int t = 0;
	
	public static final int k = 10;
	
	
	public void nonAbstractMethod() {
		System.out.println("Non -Abstact Method");
	}
	
	public abstract void abstactMethod();
	
	// Abstract class can contain all fields final, non-final, static or non-static method.
	// 
	
}
