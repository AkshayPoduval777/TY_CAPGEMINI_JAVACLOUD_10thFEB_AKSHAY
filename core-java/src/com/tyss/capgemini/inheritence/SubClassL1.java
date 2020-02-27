package com.tyss.capgemini.inheritence;

public class SubClassL1 extends SuperClass {
	
    @Override
    public String print() {
    	return "some other string";
    	
		
	}
    
    public void display() {
    	System.out.println("display() of subClass");
    }
	public static void main(String[] args) {
		SuperClass superClass=new SuperClass();
		SubClassL1 subclassL1=new SubClassL1();
		SuperClass superClass2=new SubClassL1(); //upcasting
		SubClassL1 subClassL12=(SubClassL1)superClass2; //downcasting
		System.out.println(superClass.print());
		System.out.println(subclassL1.print());
		System.out.println(subClassL12.print());
		System.out.println();
		
	}

}
