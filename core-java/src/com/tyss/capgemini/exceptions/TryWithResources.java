package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		
		try(Scanner scanner=new Scanner(System.in);) {
			int i=10;
			int j=scanner.nextInt();
			if(j==0)
				System.err.println("should not divide by zero..");
			else
			System.out.println(i/j);
			
		}//catch(Exception e) {
			//System.err.println("should not divide the number by zero");
		//	System.err.println(e.getMessage());
			
		//try withresource is internally implementing the intrface closable whic implement tthe autoclosable interface.that is no warning of the scanner class overflow

}
}
