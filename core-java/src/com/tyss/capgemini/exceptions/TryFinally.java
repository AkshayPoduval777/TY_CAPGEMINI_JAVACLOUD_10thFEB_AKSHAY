package com.tyss.capgemini.exceptions;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);

		} finally {
			System.out.println("code inside finally block");//we can use try-finally with unchecked or runtime exception
		}///but we haveto use try-catch for checked exceptions ;its mandatory
	}

}
