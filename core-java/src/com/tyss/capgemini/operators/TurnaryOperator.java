package com.tyss.capgemini.operators;

public class TurnaryOperator {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		int result=((i<j)?(i+j):(i-j));
		//System.out.println((i<j)?(i+j):(i-j));
		System.out.println(result);
		
	}

}
