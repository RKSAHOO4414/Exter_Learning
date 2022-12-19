package com.my.model.user;

import javax.persistence.Id;

public class User {
	
	@Id
	private int id;
	private String UserName;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName) {
		this.id = id;
		UserName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}
