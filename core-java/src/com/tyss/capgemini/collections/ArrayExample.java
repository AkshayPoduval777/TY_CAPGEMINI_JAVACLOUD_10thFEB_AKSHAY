package com.tyss.capgemini.collections;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intArray1 = new int[6];
		int[] intArray2 = {10,20,30,40,50,60,70,80,90,100,110};//creation & initialistion at same line

		// int intArray2[]=new int[6];not the proper way of creating array.

		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 6;
		intArray1[6]=7;
		intArray1[7]=8;
		// intArray1[5] = Integer.parseInt("1234");
		// intArray1[5]=Integer.parseInt("qwerty");throws no format execption

		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("Element at intArray1 index:" + i + "=" + intArray1[i]);
		}
		
		for(int i=0;i<intArray1.length;i++) {
			System.out.println("Element at intArray2 index:" + i + "=" + intArray2[i]);
		}
        
		//below llines of code will generate arrayindexoutofbound exception
		for (int i : intArray2) {
			System.out.println("Element at intArray2 index:" + i + "=" + intArray2[i]);
			
		}
			
		}
	}


