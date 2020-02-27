package com.tyss.capgemini.inheritence;

public interface MethodInterface {
	public void displayMessage();
	public void printMessage();
	
	public static void showMessage() {
		System.out.println("public static showMessage() of MethodInterface...");
	}
	
	default void defaultMethodMessage() {
		System.out.println("defaultMethodMessage of MethodInterface...");
	}
	

}//marker interface donot consist of any methods in it

//functionl interface contains only one method in it

//regular interface contains a number of methods in it

//we cannot use static keyword with default
