package com.tyss.capgemini.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		String string = "Some String";
		StringBuffer stringBuffer=new StringBuffer(" Some String");
		System.out.println(stringBuffer.getClass());
		
		System.out.println(stringBuffer.length());
		
		stringBuffer.append("Buffer");//same as concat of string
		System.out.println(stringBuffer);
		
		//System.out.println("stringBuffer.reverse()");//we have to reverse a string we hve to convt it to stringbuffer and reverse 
		//System.out.println("stringBuffer.reverse()");//ith venel mAATi cheytho
		
		stringBuffer.replace(0, 1, "s");
		
		stringBuffer.insert(5,"ABC");
		System.out.println(stringBuffer);
		
		int index=stringBuffer.indexOf("xyz");
		System.out.println(index);
		
		stringBuffer.delete(5, 8);
		System.out.println(stringBuffer);
	}
	
	

}
////why is string made as an immutable class?	
//write down the difference bween string stringbuffer stringbuilder