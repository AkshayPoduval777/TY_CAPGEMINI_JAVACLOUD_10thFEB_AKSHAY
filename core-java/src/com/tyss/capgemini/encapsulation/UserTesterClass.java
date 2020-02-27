package com.tyss.capgemini.encapsulation;

public class UserTesterClass {
	public static void main(String[] args) {
		User user1=new User("mike","qwertyi",10);
		User user2=new User();//we have to create a seperate constructor for this 
		
		user2.setPassword("yuiop");
		user2.setUsername("hussey");
		user2.setUserid(8);
		
		System.out.println(user2);
		
		//System.out.println(user1);/if we dont override to-string method we will get the address only
		System.out.println(user1.getUsername());
		System.out.println(user1.getUserid());
	}

}
