package com.example.designPatterns.inheritance;

import java.util.HashSet;
import java.util.Set;

class A {

	public static int x;

	public int x2;

	public String name;

	public double d2;

	A(String name) {
		System.out.println("A constructor");
	}

	A() {
	}

	public static int increment1() {
		return x++;
	}

	public int increment2() {
		x++;
		return x2++;
	}

	public final void finalExample() {
		System.out.println("final by example");
	}

//	@Override
//	public int hashCode() {
//		int prime = 31;
//		int result =1;
//		 result = prime * result+x2;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) { 
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		A other = (A) obj;
//		if (Double.doubleToLongBits(d2) != Double.doubleToLongBits(other.d2))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (x2 != other.x2)
//			return false;
//		return true;
//	}

}

class B extends A {

//	public int x2;

//    B(){
//    	
//    }	

	B(String name) {
//		super();
		System.out.println("B constructor " + name);
	}

	void onlyBMethod() {

	}

}

class C extends B {

	C(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void onlyCMethod() {

	}

}

class Hashy {

	int hx;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hx;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashy other = (Hashy) obj;
		if (hx != other.hx)
			return false;
		return true;
	}

}

public class FinoitInheritanceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// playWithStages();

		A a = new A();
		a.finalExample();

		B b = new B("");
		b.finalExample();

		C c = new C("");
		c.finalExample();
		// ccc1 = (C) new B("");
		// ccc1 = (C) bbb1;
		// ccc1 = (C) new A();
//		ccc1 = (C) aaa1;
//		C bba = (C) new A();

		// hashCodeImplementation();
	}

	private static void playWithStages() {
		B b = new B("Nitesh");
		b.x = 10;
		b.x2 = 20;

		b.increment1();
		b.increment2();

		System.out.println("X " + b.x);
		System.out.println("X2 " + b.x2);

		B.increment1();
		System.out.println("X " + b.x);
		System.out.println("X2 " + b.x2);

		A a = new A();

		B b1 = new B("");
		b.onlyBMethod();

		A b2 = new A();

		C c = new C("");
		c.onlyBMethod();
		c.onlyCMethod();

//		C bc = (C) new B("");  // valid from compilation side but in run time it will throw classcast exception
//		bc.onlyBMethod();
//		bc.onlyCMethod();

//		C ac = (C) new A();
//		ac.onlyBMethod();
//		ac.onlyCMethod();

		A ac1 = new C(null);
		// ac1.onl
		B bc1 = new C("");
		bc1.onlyBMethod();

		C cc1 = new C("");
		cc1.onlyBMethod();
		cc1.onlyCMethod();

		B bb1 = new B("");
		bb1.onlyBMethod();

		A bbc = new B(null);
		;

		if (bbc instanceof C) {
			System.out.println("bbc instance of C");
		}

		if (bbc instanceof B) {
			System.out.println("bbc instance of B");
		}

		if (bbc instanceof A) {
			System.out.println("bbc instance of A");
		}

		if (bbc instanceof Object) {
			System.out.println("bbc instance of Object");
		}

		A aaa1;
		B bbb1;
		C ccc1;

		aaa1 = new A();
		aaa1 = new B("");
		aaa1 = new C("");
		aaa1 = new A();

//		bbb1 = (B) new A();
		// bbb1 = (B) aaa1;
		bbb1 = new C("");
		bbb1 = new B("");
		bbb1 = new B(null);

		ccc1 = new C("");
	}

	private static void hashCodeImplementation() {
//		A a = new A();
//	//	a.x2 = 25;
//
//		A a2 = new A();
//	//	a2.x2 = 9;
//
//		System.out.println("hashCode a " + a.hashCode());
//		System.out.println("hashCode a2 " + a2.hashCode());
//
//		System.out.println(a.equals(a2));
//		
//		
//		Set<A> set = new HashSet<>();
//		set.add(a);
//	//	a.x2 =90;
//		set.add(a);
//		set.add(a2);
//		
//		System.out.println(set.size());

		Hashy h1 = new Hashy();
		h1.hx = 10;

		Hashy h2 = new Hashy();
		h2.hx = 10;

		Hashy h3 = h2;

		System.out.println(h1.equals(h2));

		System.out.println("hashCode a " + h1.hashCode());
		System.out.println("hashCode a2 " + h2.hashCode());

		System.out.println(h2.equals(h3));

		System.out.println("hashCode a " + h3.hashCode());
		System.out.println("hashCode a2 " + h2.hashCode());

		Set<Hashy> set = new HashSet<>();
		set.add(h3);
		set.add(h2);
		set.add(h1);

		System.out.println(set.size());

	}

}
// Takeaways
/*
 * 1. If parameterized constructor is defined in child class and parent also
 * have parameterized constructor do not have default constructor, then in sub
 * class constructor it must be called with super method parameterized
 * constructor.
 * 
 * 2. If parent class have parameterized constructor, in child class we must
 * define same constructor with same no of arguments.
 * 
 * 3. By default super constructor will call default constructor, if default
 * constructor not specified we will get compilation issue.
 * 
 * 
 */

/*
 * Interface
 * 
 * 1. All method are public and abstract, in implementation class it should be
 * defined with public keyword.
 */
