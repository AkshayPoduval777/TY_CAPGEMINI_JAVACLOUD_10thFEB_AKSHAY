package com.tyss.capgemini.methods;

public class MethoCallingClass {
	public static void main(String[] args) {
	     AreaCalculator ar=new AreaCalculator();
	      
	     System.out.println("area of square:"+ar.calculateAreaOfSquare(4));
	     System.out.println("area of rectangle:"+ar.calculateAreaOfRectangle(3,4));
	     System.out.println("area of circle:"+ar.calculateAreaOfCircle(3));
	}

}
