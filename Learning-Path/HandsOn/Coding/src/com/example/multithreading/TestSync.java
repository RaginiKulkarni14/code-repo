package com.example.multithreading;

public class TestSync extends Thread {
	
	public synchronized void m1()
	{
		System.out.println("m1");
	}
	
	public synchronized void m2()
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args)
	{
		TestSync obj1=new TestSync();
		TestSync obj2=new TestSync();
		
		obj1.m1();
		obj2.m1();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		
	}

}


