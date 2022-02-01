package com.example.stream.api;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	int marks;
	private String name;
	private int rn;
	private List<Product> al;
	
	
	public Student(int marks, String name, int rn, List<Product> al) {
		super();
		this.marks = marks;
		this.name = name;
		this.rn = rn;
		this.al = al;
	}


	public List<Product> getAl() {
		/*
		 * this.al=new ArrayList<Product>(al); return Collections.unmodifiableList(al);
		 */
		
		return this.al=Collections.unmodifiableList(new ArrayList<Product>(al));
	}


	public void setAl(List<Product> al) {
		this.al = al;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", rn=" + rn + "]";
	}

}
