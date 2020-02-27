package com.tyss.capgemini.abstraction;

public class TesterClass extends AbstractClassExample{

	@Override
	public void displayMessage() {
		System.out.println("displayMessge of MethodsIntrface");
		
	}

	@Override
	String display() {
	   return "display of AbstractClassExample";
		
	}

	@Override
	String print() {
		return "print of AbstractClassExample";
	}
	public static void main(String[] args) {
		TesterClass testerClass =new TesterClass();
		System.out.println(testerClass.print());
		System.out.println(testerClass.display());
		testerClass.printMessage();
		testerClass.displayMessage();
		
	}

}
