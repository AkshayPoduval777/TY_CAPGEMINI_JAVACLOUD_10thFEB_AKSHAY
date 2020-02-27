package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			//System.exit(0);//it does not happen of terminating here,
			//it goes to catch block after try block

		} catch (ArithmeticException e) {
			System.err.println("exception caught in the code");
			//System.exit(0);
			
		} catch (Exception e) {
			System.err.println("catch(Exception e)");
//			System.exit(0);//finally block will not execute,jvm will shut down & furthr nothing happens
			
		} finally {
			System.out.println("code to be executed be there any exception or not");
		}
		System.out.println("some code");
	}
}
