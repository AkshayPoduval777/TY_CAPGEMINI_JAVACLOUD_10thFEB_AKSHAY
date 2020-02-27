package com.tyss.capgemini.inheritence;

public interface FunctionalInterfaceExample2 {
	public int add(int i,int j);
	
	public void showMessage();
	
	public static void printMessage() {

		System.out.println("pubic static printMessage() of FunctionalInterfaceExample2");
		
	}
	default void messageDiplay() {
		System.out.println("default messageDisplay() of FunctionalInterfaceExample2");
	}

  
}
