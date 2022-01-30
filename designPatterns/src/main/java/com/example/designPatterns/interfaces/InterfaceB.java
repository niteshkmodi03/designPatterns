package com.example.designPatterns.interfaces;

public interface InterfaceB {

	public int i = 0;

	public static int t = 0;

	public static final int k = 0;

	public static int j = 0;

	default void showDefaultInfo() {
		System.out.println("default method from A");
	}

	static void showStaticInfo() {
		System.out.println("static method from A");
	}

	public void displayInfoFromB();
}
