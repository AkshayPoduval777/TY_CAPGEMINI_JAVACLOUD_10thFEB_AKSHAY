package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester2 {
	public static void main(String[] args) throws InvalidNumberCustomException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int number = sc.nextInt();

		sc.close();

		try {
			System.out.println(10 / number);
		} catch (Exception e) {
			new InvalidNumberCustomException("Any Message");

		}

	}
}
