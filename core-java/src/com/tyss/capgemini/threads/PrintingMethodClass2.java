package com.tyss.capgemini.threads;

public class PrintingMethodClass2 extends Thread {
	 public void run() {
		 try {
		 Thread.sleep(500);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		for(int i=1;i<10;i++) {
			System.err.println("Printing Value: " + i);

		}
	}

}
