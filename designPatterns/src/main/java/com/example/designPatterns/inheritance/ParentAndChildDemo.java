package com.example.designPatterns.inheritance;

public class ParentAndChildDemo {

	public static void main(String[] args) throws Exception {

		/*
		ParentClass parent = new ParentClass();
		parent.commonMethod();
		parent.parentMehtod();
		parent.doInnerThings();
		System.out.println("-----------------");
		ParentClass parentChild = new ChildClass();
		parentChild.commonMethod();
		parentChild.parentMehtod();

		System.out.println("-----------------");
		ChildClass child = new ChildClass();
		child.childMethod();
		child.commonMethod();
		child.parentMehtod();*/
		try {
		try 
		{
			int t =10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("in MAin try");
			throw new ArrayIndexOutOfBoundsException();
		}finally {
			
			System.out.println("finally");
			int t = 10/0;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("MAin try arithmetic");
		}
		catch(Exception e){
			System.out.println("MAin try");
		}
		System.out.println("Afterr try catcgh");
	}

}
