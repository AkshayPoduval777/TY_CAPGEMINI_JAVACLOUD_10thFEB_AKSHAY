package com.tyss.capgemini.inheritence;
import com.tyss.capgemini.methods.BasicArithmeticOperations;

public class SomeArithmeticOperations extends BasicArithmeticOperations {
	public  SomeArithmeticOperations(){
	 super("akshay");
	 System.out.println("SomeArithmeticOperations constructor");
	 
	}
	public static void main(String[] args) {
		SomeArithmeticOperations sao=new SomeArithmeticOperations();
		
		System.out.println("add methd o superclass:" + add(7,7));
		System.out.println("mul methd o superclass:" + mul(7,7));
		System.out.println("sub methd o superclass:" + sub(7,7));
		System.out.println("div methd o superclass:" + div(7,7));
		
	}

}
