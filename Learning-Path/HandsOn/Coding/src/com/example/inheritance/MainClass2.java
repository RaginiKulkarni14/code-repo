package com.example.inheritance;

public class MainClass2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		System.out.println(p.getObject().x);
	}
}

class Parent2 {
	int x = 10;

	public Parent2 getObject() {
		return new Parent2();
	}
}

class Child2 extends Parent2 {
	int x = 20;

	public Child2 getObject() {
		return new Child2();
	}
}
