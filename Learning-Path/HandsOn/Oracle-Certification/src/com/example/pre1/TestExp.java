package com.example.pre1;

public class TestExp {

	public static void test()
	{
		try {
			System.out.println("test");
			throw new RuntimeException();
		}
		catch(Exception ex) {
			System.out.println("Exceptionsss");
		}
	}
	
	public static void main(String[] args) {
		try {
			test();
		}
		catch(RuntimeException ex) {
			System.out.println("runtime");
		}
		System.out.println("end");
	}

}
