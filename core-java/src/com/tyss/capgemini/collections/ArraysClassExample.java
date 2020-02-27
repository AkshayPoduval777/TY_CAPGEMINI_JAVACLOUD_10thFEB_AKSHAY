package com.tyss.capgemini.collections;
  
import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] intArray = {3,4,8,1,2,5,0};
		int[] intArray1=intArray;
		Arrays.sort(intArray);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println(Arrays.toString(intArray));
		System.out.println(intArray.length);
		
		int[] intArray2=Arrays.copyOf(intArray, 13);
		
		for(int i=0;i< intArray2.length;i++) {
			System.out.println(intArray[2]);
		}
		
		System.out.println("**********");
		//Arrays.fill(intArray2,);
		Arrays.fill(intArray2,8,9,2);
		Arrays.fill(intArray2,8,10,12);
		
		
		for(int i=0;i<intArray2.length;i++);
		System.out.println(intArray[2]);
		
		System.out.println("**************");
		
		System.out.println(intArray.equals(intArray2));
		System.out.println(Arrays.equals(intArray, intArray2));


	
	}
}
