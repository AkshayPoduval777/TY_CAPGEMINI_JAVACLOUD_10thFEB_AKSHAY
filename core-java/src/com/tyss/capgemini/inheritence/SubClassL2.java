package com.tyss.capgemini.inheritence;

public class SubClassL2 extends SubClassL1 {
	@Override
	public void display() {
		super.display();
		super.i=12;
		System.out.println("Override display() in subClassL2");
	}
	@Override
	public String print() {
		System.out.println("Overriden print() of SuperClass in subClass2");
		return super.print();
		
	}
	 
	 int j=super.i;//we have towrite super without sttaic keyword and super must be in method scope not in class scope
	
	public static void main(String[] args) {
		SubClassL2 subClassL2=new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		
		System.out.println("int i of SuperClass:" + subClassL2.i);
	}

}
