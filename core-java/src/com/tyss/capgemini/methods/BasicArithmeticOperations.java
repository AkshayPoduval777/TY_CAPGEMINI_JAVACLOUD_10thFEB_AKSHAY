package com.tyss.capgemini.methods;

public class BasicArithmeticOperations {
	public BasicArithmeticOperations(String string) {
		System.out.println("BasicArithmeticOperations Constructor");
		
	}
	public static int add(int i,int j) {
		int sum=i+j;
		return sum;
	}
	
	public static int sub(int i,int j) {
		return i-j;
	}
	
	public static double div(int i,int j) {
		return (i/j)*1.0;
	}
	
	public static int mul(int i,int j) {
		return i*j;
	}
public static void main(String[] args) {
	int sum=add(12,13);
	System.out.println("sum:" +sum);
	System.out.println("sum:"+ add(45,45));
	System.out.println("sum:"+ sub(50,45));
	System.out.println("sum:"+ div(45,45));
	System.out.println("sum:"+ mul(45,2));
}	
	
}	

