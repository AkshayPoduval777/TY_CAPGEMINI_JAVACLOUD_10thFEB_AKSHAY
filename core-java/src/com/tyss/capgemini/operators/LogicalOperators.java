package com.tyss.capgemini.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		int k=30;
		
		//AND LOGICAL OPERATOR//
		 System.out.println((i>j)&&(j>k));
		 System.out.println(i>j&&(j<k));
		 System.out.println(i<j&&(j<k));
		 System.out.println(i<j&&(j>k));
		 
		 System.out.println("******");
		 
		 //OR LOGICAL OPERATOR//
		 System.out.println((i>j)||(j>k));
		 System.out.println(i>j||(j<k));
		 System.out.println(i<j||(j<k));
		 System.out.println(i<j||(j>k));
		
	}

}
