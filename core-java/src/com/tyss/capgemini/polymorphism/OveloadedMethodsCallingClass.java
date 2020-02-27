package com.tyss.capgemini.polymorphism;

public class OveloadedMethodsCallingClass {
	public static void main(String[] args) {
		OverloadedMethodsClass overloadedMethodsClass=new OverloadedMethodsClass();
	  System.out.println(overloadedMethodsClass.add(5,6));
	  System.out.println(overloadedMethodsClass.add(5,7,8));
	  System.out.println(overloadedMethodsClass.add(8,3));
	  System.out.println(overloadedMethodsClass.add(3,3));
	}

	
	

}
