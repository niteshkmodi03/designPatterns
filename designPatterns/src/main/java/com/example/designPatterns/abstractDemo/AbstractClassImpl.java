package com.example.designPatterns.abstractDemo;

public class AbstractClassImpl extends AbstractClassB{

	@Override
	public void abstactMethodFromA() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		AbstractClassImpl ab = new AbstractClassImpl();
		System.out.println(ab.i);
		System.out.println(ab.t);
		
		System.out.println(AbstractClassImpl.j);
		
	}
	

}




