package com.tyss.capgemini.strings;

public class StringMethodsExample {
	public static void main(String[] args) {
		
	    String string1= "Some String";//initcap
		String string2= "";
		String string3="sOME sTRING";//camelcase
		
		System.out.println("length of string1:"+ string1.length());
		System.out.println("isEmpty()of String:" + string1.isEmpty());
		
		System.out.println("length of string2:" + string2.length());
		System.out.println("isEmpty()of String:" + string2.isEmpty());
		
		System.out.println(string1.charAt(string1.length()-1));//we have to give length-1 because length start from 1.
		System.out.println(string1.charAt(7));// ithum cheyyaam.....alenkil mukalil illathum cheyya
		//System.out.println(string2.charAt(7));
		
		System.out.println("equals() of String:" + string1.equals(string3));//it wwill check each and every character
		System.out.println("equalsIgnorecase() of string:" + string1.equalsIgnoreCase(string3));//it just checks 
		
		//string1.concat("concatenated string");//we cannt do like this 
		
		//string1=string1.concat("concatenated string");
		System.out.println(string1);//we can do like this also
		
		System.out.println(string1.concat("concatenated string"));//we can do like this also
		
		string1=string1.replace('S', 's');
		System.out.println(string1);
		
		String string6=String.valueOf(123456);//converts data into string-icompass question
		System.out.println(string6);
		
		System.out.println(string1.toLowerCase());
		System.out.println(string1.toUpperCase());
		
		System.out.println(string1.substring(5));
		System.out.println(string1.substring(5, 9));
		
		System.out.println(string1.startsWith("A"));
		System.out.println(string1.endsWith("l"));
		System.out.println(string1.endsWith(string2));
		
		System.out.println(string1);//prints "Some String" as string is immutable
		
		
		string1.reverse()//ith ithhil cheyyan patoola..string buffer bhagath reverse und..
	}

}
