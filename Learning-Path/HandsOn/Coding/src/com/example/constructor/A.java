package com.example.constructor;

public class A {
	
	A(int a)
	{
		
	}
	
	public A() {
		super();
		System.out.println(1);

		// Constructor calling statements ( super() or this() ), if written, must be the
		// first statements in the constructor.
		// super();

		System.out.println(2);
	}
}

class B extends A
{
	
}