package com.tyss.capgemini.inheritence;
import com.tyss.capgemini.methods.methods;

public class DifferentPackageMethodOverridingClass extends methods {
	@Override
	public String printMessage() {
		return super.printMessage();
	}
	
	
	@Override
	protected String welcomeMessage() {
		return super.welcomeMessage();
	}
	
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass=new DifferentPackageMethodOverridingClass();
		
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.welcomeMessage());
	}
	

}
