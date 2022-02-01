package com.example.functional.intf;

import java.util.*;

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
		
		Arithmetic div=(a,b) -> {
			try
			{
				return (a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("e occured");
			}
			return (a/b);
		};
		System.out.println("div " + div.operations(10, 0));
		
		//strLength = (String str) -> str.length();
		
		List<Integer> al = Arrays.asList(3, 9, 7, 0, 10, 20);
		al.forEach(i -> {
		    try {
		        System.out.println(50 / i);
		    } catch (ArithmeticException e) {
		        System.err.println(
		          "Arithmetic Exception occured : " + e.getMessage());
		    }
		});
	}
}
