package com.tyss.capgemini.threads;

public class ComputerSystem1 extends Thread {
	PrintingApplication printingApplication;
	
	public ComputerSystem1(PrintingApplication localPrintingApplication ) {
		this.printingApplication=localPrintingApplication;
	}
	
	@Override
	public void run() {
		System.err.println(">>>>Printing from Computer System...");
		printingApplication.printingDocuments("Any Document.pdf", 10);
	}

}
