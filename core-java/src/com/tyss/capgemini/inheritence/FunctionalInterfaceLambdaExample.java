package com.tyss.capgemini.inheritence;

public class FunctionalInterfaceLambdaExample {
	static String string = "Lambda Expression Example for FunctionalInterfaceExample";
	static FunctionalInterfaceExample functionalInterfaceExample = () -> System.out.println(string);
    
	
	public static void main(String[] args) {
		 functionalInterfaceExample.displayMessage();
		 functionalInterfaceExample.showMessage();
		 
		 FunctionalInterfaceExample.printMessage();
	}
}
