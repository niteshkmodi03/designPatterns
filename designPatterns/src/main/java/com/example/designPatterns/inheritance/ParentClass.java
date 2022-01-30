package com.example.designPatterns.inheritance;

public class ParentClass {

	private int x;

	public void parentMehtod() throws Exception {
		System.out.println("Parent class method");
	}

	public void commonMethod() throws Exception {
		System.out.println("Parent class common method");
	}

	public void doInnerThings() {

		class InnerParentClass {
			protected String name;

			public void doSomeThings() {
				System.out.println("Outer Value of x is :" + x);

				System.out.println("Value of name is :" + name);
			}
		}
		
		InnerParentClass inn = new InnerParentClass();
		inn.doSomeThings();
	}

}
