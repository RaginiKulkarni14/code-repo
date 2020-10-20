package com.example.controller;

public class Topics {

	private String name;
	private String id;

	
	public Topics() {
		
	}
	
	public Topics(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setRno(String rno) {
		this.id = rno;
	}
	
	
}
