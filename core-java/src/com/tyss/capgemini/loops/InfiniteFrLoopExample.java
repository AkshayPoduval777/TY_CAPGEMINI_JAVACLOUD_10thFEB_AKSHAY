package com.tyss.capgemini.loops;

public class InfiniteFrLoopExample {
	public static void main(String[] args) {
		int i=10;
		
		for(;;) {
			System.out.println(i);
		}
		
		//we cannot have any line of code after an infinite loop
		//System.out.println("hello world");
	}

}
