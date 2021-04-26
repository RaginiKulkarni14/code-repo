package com.example.functional.intf;

interface Arithmetic
{
	int operations(int a,int b);
}

public class ArithmeticOpeations {
	
	public static void main(String args[])
	{
		Arithmetic add = (a,b) -> (a+b);
		System.out.println("add " + add.operations(10,20));
		
		Arithmetic sub = (a,b) -> (a-b);
		System.out.println("sun " + sub.operations(10, 5));
		
		Arithmetic mul = (a,b) -> (a*b);
		System.out.println("mul " + mul.operations(5, 2));
		
		Arithmetic safeDiv = (a,b) -> {
			if(b==0) return 0;
			return (a/b);
		};
		System.out.println("safeDiv " + safeDiv.operations(10, 5));
		
		//strLength = (String str) -> str.length();
	}
}
