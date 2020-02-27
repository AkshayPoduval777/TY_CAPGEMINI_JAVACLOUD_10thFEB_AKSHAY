package com.tyss.capgemini.loops;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%2==0) {
			//multiple times print cheyyan
			for(int i=1;i<=n;i++) {
				System.out.println("Number is even");
			}
		}
		else {
			System.out.println("number is odd");
			
		//to avoid resource leak	
		sc.close();
		}
		
	}

}
