package com.tyss.capgemini.inheritence;

public class MethodsInterfaceJ8Impl implements MethodInterface{

	@Override
	public void displayMessage() {
		System.out.println("Overriden displayMessage() of Method Interface");
	}

	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of Method Interface");
		
	} 
	
	
	
	public static void main(String[] args) {
		MethodsInterfaceJ8Impl methodsInterfaceJ8Impl=new MethodsInterfaceJ8Impl();
		
		methodsInterfaceJ8Impl.displayMessage();
		methodsInterfaceJ8Impl.printMessage();
		methodsInterfaceJ8Impl.defaultMethodMessage();
		
		MethodInterface.showMessage();
		
	}
	

}
