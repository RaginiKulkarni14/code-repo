package com.example.list;

import java.sql.Date;

public class Student {

	int marks;
	private String name;
	private int rn;
	

	public Student(int marks, String name, int rn) {
		super();
		this.marks = marks;
		this.name = name;
		this.rn = rn;
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
