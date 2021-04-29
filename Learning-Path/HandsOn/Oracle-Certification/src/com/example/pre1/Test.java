package com.example.pre1;

interface TestA
{
	public String toString();
}

public class Test
{
	public static void main(String args[])
	{
		//doesn't work on toString
		//TestA tt = () -> { return "msg"; };
		
		System.out.println(new TestA() {
			public String toString()
			{
				return "msg";
			}
		});
	}
}