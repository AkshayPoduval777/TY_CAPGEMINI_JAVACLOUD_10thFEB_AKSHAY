package com.tyss.capgemini.primitivedatatyesandvariables;

public class VariablesExamples {
	static byte sGByte;
	static short sGShort;
	static int sGInt;
	static long sGLong;
	static float sGFloat;
	static double sGDouble;
	static char SGChar;
	static boolean sGIsTrue;
	static String sGString;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte lByte;
		short lShort;
		int lInt;
	    long lLong;
	    float lFloat;
		double lDouble;
		char lChar;
	    boolean lIsTrue;
	    String llString;
	     
	    //local variabless cant be printed wehae to initialize it first
	    System.out.println(lGByte);
	    System.out.println(lGShort);
	    System.out.println(lGInt);
	    System.out.println(lGLong);
	    System.out.println(lGFloat);
	    System.out.println(lGDouble);
	    System.out.println(lGChar);
	    System.out.println(lGIsTrue);
	    System.out.println(lGString);
	    
	    //static variables
	    System.out.println(sGByte);
	    System.out.println(sGShort);
	    System.out.println(sGInt);
	    System.out.println(sGLong);
	    System.out.println(sGFloat);
	    System.out.println(sGDouble);
	    System.out.println(SGChar);
	    System.out.println(sGIsTrue);
	    System.out.println(sGString);

	}

}