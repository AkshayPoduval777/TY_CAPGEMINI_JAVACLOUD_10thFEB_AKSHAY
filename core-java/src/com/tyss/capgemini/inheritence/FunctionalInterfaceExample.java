package com.tyss.capgemini.inheritence;

@FunctionalInterface
public interface FunctionalInterfaceExample { //functonalinterace has only one abstract method
	public void showMessage();
	//public void displayMessage();
    //public void printMessage();
	
	public static void printMessage() {

		System.out.println("pubic static printMessage() of FunctionalInterfaceExample");
		
	}
	default void displayMessage() {
		System.out.println("default displayMessage() of FunctionalInterfaceExample");
	}

}
