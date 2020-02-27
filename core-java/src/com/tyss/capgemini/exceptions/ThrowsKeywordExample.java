package com.tyss.capgemini.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ThrowsKeywordExample {
	public static void main(String[] args)throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		//new Properties().load(new FileReader("applications.properties"));
		new Properties().load(new FileReader("application.properties"));
		
		System.out.println(properties.getProperty("name"));
		
		System.out.println("some code..");
	}
	
	

}
