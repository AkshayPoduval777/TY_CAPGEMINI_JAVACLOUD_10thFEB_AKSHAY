package com.tyss.capgemini.threads;

public class PrintingApplication {
	synchronized public void printingDocuments(String document, int numOfCopies) {
		for(int i=1;i<=numOfCopies;i++) {
			//venamenkil sleep method invoke cheyyam..
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">>Printing " + document + "#" +i);
			
		}
		
	}
	//we can also use synchronized keyword by commenting and effective method is doing both(synchronized and join)
	//join method9try-catch)..lock is acuired for individual first computer 1 and then after it lock to computer 2

}
