package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass1 implements MethodsInterface {
	
	@Override
	public String displayMessage() {
		return "overriden method message";
	}

	@Override
	public String printMessage() {
		return "overriden printmessage";
	}
	
	

}
