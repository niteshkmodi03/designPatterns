package com.example.designPatterns.interfaces;

public class InterfaceImpl implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		InterfaceA ia = new InterfaceImpl();
		ia.displayInfoFromA();
		ia.showDefaultInfoFromA();
		
//		InterfaceA.
	    System.out.println(""+ia.i+" "+ia.j+ " "+ia.k+ " "+ia.t);
		
		InterfaceA.showStaticInfo();
		InterfaceB.showStaticInfo();

		InterfaceImpl impl = new InterfaceImpl();
		impl.displayInfoFromA();
		impl.displayInfoFromB();
		impl.showDefaultInfo();
		
		
		InterfaceA iaa = new InterfaceA() {

			@Override
			public void displayInfoFromA() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		iaa.displayInfoFromA();
		
	}

	@Override
	public void displayInfoFromB() {
		System.out.println("Default method B");
	}

	@Override
	public void displayInfoFromA() {
		System.out.println("Default method A");
	}
	
	
	// If there are same default method name in interface, will it give you error while implementing it, yes it will give error.
    //	All the fields are static and final

}
