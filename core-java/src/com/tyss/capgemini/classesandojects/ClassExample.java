package com.tyss.capgemini.classesandojects;

public class ClassExample {
	
	//Zero-argument constructor 
	public ClassExample() {
		System.out.println("Zero-argument constructor...");

 }
	
	//parameterized constructor
	public ClassExample(String string) {
		System.out.println("constructor with one string argument...");
	}
	
	//parameterized constructor
	public ClassExample(String string,int i) {
		System.out.println("constructor with one string argument and one integer argument...");
	}
	
	//parameterized constructor
	public ClassExample(int i,String s) {
		System.out.println("constructor with one string argument and one integer argument...");
		
	}
	
	public static void main(String[] args) {
		ClassExample ce1=new ClassExample();
		ClassExample ce2=new ClassExample("Any String");
		ClassExample ce3=new ClassExample("Any String",1234);
		ClassExample ce=new ClassExample(1234,"Any String");
		
	}
}	
