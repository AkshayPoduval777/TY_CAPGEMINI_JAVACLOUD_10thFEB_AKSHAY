package com.tyss.capgemini.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>(10);
		
		arrayList.add(12);
		arrayList.add(0, 27);
		arrayList.add(1, 32);
		arrayList.add(13);
		arrayList.add(12);
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(18);
		
		
		System.out.println("Size of ArrayList:" + arrayList.size());
	     
		for (Integer integer : arrayList) {
			System.out.println(integer + "");
			
		}
		
		System.out.println();
		System.out.println("*************");
		
		System.out.println(arrayList);
		System.out.println("******************");
		
//		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));//throws exception since size is 3
		 
		//rand reethiyl cheyyam...onn foreach loopvechit pinne onn get method vechit
		
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(arrayList.get(i) +"");
			
		}
		System.out.println();
		System.out.println("*************");
		
		Collections.rotate(arrayList, -(arrayList.size()-1));
		
		arrayList.remove(4);
		System.out.println(arrayList);
		System.out.println("**************");
		
		boolean isThere=arrayList.contains(27);
		System.out.println(arrayList.contains(27));//itho allenkil ithinte thaayathe coment chytath chytho
		
		boolean isThere1=arrayList.contains("tree");
		System.out.println(arrayList.contains("tree"));
		
		boolean isThere2=arrayList.contains(null);
		System.out.println(arrayList.contains(null));
		
//		boolean isThere=arrayList.contains(27);
//		System.out.println("output of arrayList.contains(27):" + isThere);
	}

}
