package com.tyss.capgemini.threads;

public class PrintingValues {
	
	public static void main(String[] args) {
		System.out.println("+++Appicaton started+++++++");
		
		PrintingMethodClass1 printingMethodClass1=new PrintingMethodClass1();
		try {
			printingMethodClass1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		printingMethodClass1.start();
		
		
		PrintingMethodClass2 printingMethodClass2=new PrintingMethodClass2();
		try {
			printingMethodClass1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		printingMethodClass2.start();
		
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e1){
			e1.printStackTrace();
			
		}
		
		
		
		System.out.println("+++++++++Application Ended++++++++");
	}//thread-data inconsistency-when multiple threads share the same memory there is achance that
	//ntwo ormore threads perfoming
	//different operation on saame datainterleave each other and create data inconsisency
	
	
     //1.extends thread
	//2.implements runnable interface-first you have to make the class thread
}
