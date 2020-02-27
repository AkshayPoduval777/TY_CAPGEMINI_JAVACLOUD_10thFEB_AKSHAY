package com.tyss.capgemini.classesandojects;

import com.tyss.capgemini.methods.BasicArithmeticOperations;

public class DifferentPackageMethodsExample extends BasicArithmeticOperations {
	public static void main(String[] args) {
		
		DifferentPackageMethodsExample dpme=new DifferentPackageMethodsExample();
		System.out.println(dpme.toString());
		System.out.println(dpme.hashCode());
		
		System.out.println("add method of superclass:" + add(8,9));
		System.out.println("sub method of superclass:" + sub(8,5));
		System.out.println("mul method of superclass:" + mul(8,5));
		System.out.println("div method of superclass:" + div(8,5));
		
	//	BasicArithmeticOperations.add(4, 7);
		add(8,9); //posssible bcz of inheritence -inheried from bscarimtmtc oprtn
	}

}
