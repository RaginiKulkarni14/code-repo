package com.example.basicOp;

public class Test {
	
	public static void main(String []args)
	{
		Integer i=2;
		System.out.println(incr(i));
		i=incr(i);
		System.out.println(i);
		
		int k=2;
		System.out.println(incr(k));
		
		k=incr(k);
		
		System.out.println(k);
		
		
	}
	
	public static Integer incr(Integer i)
	{
		return ++i;
	}
	
	public static int incr(int i)
	{
		return ++i;
	}

}
