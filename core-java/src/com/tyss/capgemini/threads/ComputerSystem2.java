package com.tyss.capgemini.threads;

public class ComputerSystem2 extends Thread {
PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication localPrintingApplication ) {
		this.printingApplication=localPrintingApplication;
	}
	
	@Override
	public void run() {
		System.out.println(">>>>Printing from Computer System2...");
		printingApplication.printingDocuments("Some other document.pdf", 10);
	}

}
