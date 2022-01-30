package com.example.designPatterns.interfaces;

public interface InterfaceA {

	int i = 5;

	public static int t = 9;

	public static final int k = 0;

	public final int j = 0;

	default void showDefaultInfoFromA() {
		System.out.println("default method from A");
	}

	static void showStaticInfo() {
		System.out.println("static method from A");
	}

	public void displayInfoFromA();
	
	
}
