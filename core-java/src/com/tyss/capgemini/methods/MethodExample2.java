package com.tyss.capgemini.methods;

public class MethodExample2 {
	public void displayMessage() {
		System.out.println("Start of displayMessage()");
		System.out.println("hello world");
		System.out.println("End of displayMessage");
	    System.out.println("Returning to calling method");
	}
		
	
	public static void main(String[] args) {
		MethodExample2 Me=new MethodExample2();
		System.out.println("called displayMessage()via object..");
		Me.displayMessage();
		System.out.println("end of main method");
		
	}

}
