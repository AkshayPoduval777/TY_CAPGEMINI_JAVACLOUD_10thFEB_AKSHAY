package com.tyss.capgemini.methods;

public class MethodExample1 {
	
	//called method
	public static void displayMessage() {
		System.out.println("execution comes to displayMessage method");
		System.out.println("Hello World");
		System.out.println("end of displayMessage Method");
	}
	 
	//calling mehod
	public static void main(String[] args) {
		System.out.println("displayMessage method id called");
		displayMessage();
		System.out.println("end of main method");
	}
}	
	

// we cannot create a method inside another method
//	public static void name() {
//		public static void name1() {
//	}
//	
//}
