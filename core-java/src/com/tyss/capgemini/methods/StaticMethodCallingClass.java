package com.tyss.capgemini.methods;

public class StaticMethodCallingClass {
	public static void main(String[] args) {
		BasicArithmeticOperations.add(8, 9);
		System.out.println("sum: "+BasicArithmeticOperations.sub(6, 4));
		
		System.out.println("sub:" +BasicArithmeticOperations.sub(6, 4));
		System.out.println("div:" +BasicArithmeticOperations.div(6, 4));
		System.out.println("mul:" +BasicArithmeticOperations.mul(6, 4));
		
	}
	

}
