package com.tyss.capgemini.threads;

public class CustomThreadTester {
	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();

		// System.out.println("main method started");

		new CustomThread1(object1, object2).start();
		new CustomThread2(object1, object2).start();

	}
}
