package com.tyss.capgemini.exceptions;

import java.util.Properties;
import java.io.FileReader;

public class CheckedException {
	public static void main(String[] args) {
		Properties properties =new Properties();
		
		try {
			//properties.load(new FileReader("applications.properties"));
			properties.load(new FileReader("application.properties"));
			System.out.println(properties.getProperty("name"));
		}catch(Exception e) {
			System.err.println("Exception caught in try..");
			e.printStackTrace();
		}finally {
			System.out.println("code in fnally block");
		}
		
	}

}
