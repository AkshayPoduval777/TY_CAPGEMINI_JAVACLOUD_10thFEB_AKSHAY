package com.tyss.capgemini.encapsulation;

public class User {
	private String username;
	private String password;
	private int userid;
	
	public User(String username,String password,int userid) {
		this.username=username;
		this.password=password;
		this.userid=userid;
	}



	public User() {
		this.username=username;
		this.password=password;
		this.userid=userid;
	}


//we have to use alt+shift+s for geting the getter and setter methods..and to invoke tostring methods
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userid=" + userid + "]";
	}
	
	
	

}
