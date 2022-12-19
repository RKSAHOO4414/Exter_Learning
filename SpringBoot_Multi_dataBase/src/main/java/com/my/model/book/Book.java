package com.my.model.book;

import javax.persistence.Id;

public class Book {

	@Id
	private int id;
	private String name;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
