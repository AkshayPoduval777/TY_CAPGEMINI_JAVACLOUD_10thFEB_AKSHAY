package com.tyss.capgemini.exceptions;

public class InvalidNumberCustomException extends Exception {// even if we extend runtimeexcptn its okay
	public InvalidNumberCustomException(String message) {
		System.err.println(message);// you will get the custom exception
		// super(message); //you will get the exception message that is predefined
	}
}
