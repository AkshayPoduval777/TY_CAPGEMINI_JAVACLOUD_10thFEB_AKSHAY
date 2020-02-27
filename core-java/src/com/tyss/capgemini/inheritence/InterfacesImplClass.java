package com.tyss.capgemini.inheritence;

public class InterfacesImplClass implements MethodInterface,AnotherMethodsInterface {
	@Override
	public void displayMessage(){
		System.out.println("overriden displayMessage() of MethodInterface");
	}
	
	@Override
	public void printMessage(){
		System.out.println("Overriden printMessage() of MethodInterface");
	}
	
	@Override
	public void messageDisplay() {
		System.out.println("overriden messageDisplay() of AnotherMethodsInterface");
	}
	
	public static void main(String[] args) {
//		MethodInterface methodInterface=new InterfacesImplClass();
//		AnotherMethodsInterface anotherMethodInterface=new InterfacesImplClass();
//		methodInterface.printMessage();
//		methodInterface.displayMessage();
//		anotherMethodInterface.messageDisplay();
//		
		InterfacesImplClass implClass=new InterfacesImplClass();
		implClass.displayMessage();
		implClass.messageDisplay();
		implClass.printMessage();
	}
	

}
