package com.example.designPatterns.inheritance;

public class ChildClass extends ParentClass {
	
	public void childMethod() {
		System.out.println("Child class method");
	}
	
	ChildClass(){
		super();
	}
	@Override
	public void parentMehtod() throws Exception{
		
	//	super.parentMehtod();
		System.out.println("Parent class method in child class");
	}
	
	@Override
	public void commonMethod() {
		//super.commonMethod();
		System.out.println("Parent class common method in child class");
	}

}
