package com.tyss.capgemini.polymorphism;

public class MethodsInterfaceCaller {
	public static void main(String[] args) {
//		MethodOverridingClass1 methodOverridingClass1 =new MethodOverridingClass1();
//		MethodsOverridingClass2 methodsOverridingClass2=new MethodsOverridingClass2();
//		
//		System.out.println(methodOverridingClass1.printMessage());
//		System.out.println(methodOverridingClass1.displayMessage());
//		
//		System.out.println(methodOverridingClass2.printMessage());
//		System.out.println(methodOverridingClass2.displayMessage()); 
	
	//ithinu mukalil ullath caller method(mai method) vech print chyunnathann...
	//thaazhe ullath interface reference vech cheuunata
		
		
		
		MethodsInterface methodsinterface1=new MethodOverridingClass1();
		MethodsInterface methodsinterface2=new MethodsOverridingClass2();
		
		
		System.out.println(methodsinterface1.printMessage());
		System.out.println(methodsinterface1.displayMessage());
		
		System.out.println( methodsinterface2.displayMessage());
		System.out.println( methodsinterface2.printMessage());
	}
	
	
	

}
