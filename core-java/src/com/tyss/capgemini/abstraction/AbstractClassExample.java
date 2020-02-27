package com.tyss.capgemini.abstraction;

import com.tyss.capgemini.inheritence.MethodInterface;

public abstract class AbstractClassExample implements MethodInterface{
	abstract String display();
	abstract String print();
	
	@Override
	public void printMessage() {
		System.out.println("printMessage method of MethodsInterface");
		
	}

}
