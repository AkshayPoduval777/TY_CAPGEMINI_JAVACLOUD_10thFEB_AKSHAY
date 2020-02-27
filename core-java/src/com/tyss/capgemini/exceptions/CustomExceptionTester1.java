package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester1 {
	public static void main(String[] args) throws InvalidNumberCustomException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int no = sc.nextInt();

		sc.close();// to stop taking input from user

		if (no >= 0 && no <= 10) {
			System.out.println(no * 10);

		} else {
			throw new InvalidNumberCustomException("Custom Exception Message");// no methods prsent in exeption..method
																				// like printstacktrace are prsent in
																				// throwable class whic are inherited by
																				// exeption
		}
	}

}
