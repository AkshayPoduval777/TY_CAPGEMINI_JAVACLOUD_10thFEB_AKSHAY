package com.tyss.capgemini.exceptions;

public class ExceptionExample {
	public static void main(String[] args) {
		String string = "";

		// value of highest index will be lessthan length
		try {
			//System.out.println(string.charAt(3));
			int i=10 / 0;
			System.out.println(i);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("charAt(int index)should not be called on null String"); //exception classes donot have any methods,also its npt goodpractice to write printstacktrace
         
			System.out.println(e.getClass());//gets the class of exception occurd here
			System.out.println(e.getCause());//return type is throwble,nothing is thrwong..hence null
			System.out.println(e.getMessage());
			
		}catch (Exception e) {
			System.err.println("should not divide b zero");//we cannot write exception in first
			System.out.println(e.getClass());//we should write exception at last if we have multiple catch block
			System.out.println(e.getCause());//if we write first then exception itself handles every exception
			System.err.println(e.getMessage());//and remaining exception blocks gives error
			
//		}catch(Exception e){
//			System.err.println("exception cught in the code");
//			System.out.println(e.getMessage());
//			
//		}
	}

}
}	
	
