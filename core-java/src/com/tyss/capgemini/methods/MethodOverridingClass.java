package com.tyss.capgemini.methods;

public class MethodOverridingClass {
	@Override
	public String printMessage() {
		return "non-static MethodOverridingClass.printMessage()";
	}

	@Override // cannot override static methods
	public static String displayMessage() {
		return "Static MethodOverridingClass.displayMessage()";
	}
	
	@Override
	protected String welcomeMessage() {
		return super.welcomeMessage();
	}
	
	@Override
	int addingTwoIntegers(int i,int j) {
		return super.addingtwoIntegers(i,j);
	}

	public static void main(String[] args) {
		System.out.println(new MethodOverridingClass().printMessage());
		System.out.println(methods.displayMessage());
		System.out.println(displayMessage());
	}

}
