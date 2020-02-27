package com.tyss.capgemini.loops;

public class WhilLoopExample {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i*18);
			i++;
		}
		
		System.out.println("**********Infinite loop**********");
		
		//infinite loop
		while(true) {
			System.out.println("hello java");
		}
	}

}
