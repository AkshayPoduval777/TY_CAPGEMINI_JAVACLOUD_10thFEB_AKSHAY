package com.tyss.capgemini.collections;

public class CustomListExecutor {
	public static void main(String[] args) {
			CustomList customList=new CustomList(4);
			customList.add("1");
			customList.add("4");
			customList.add("1");
			customList.add("4");
			customList.add("1");
			
			System.out.print("CustomList size:" + customList.size());
			
			for(int i=0;i< customList.size();i++) {
				System.out.println("element at" + i + "index: +customList.get(i)");
			}

	}

}
