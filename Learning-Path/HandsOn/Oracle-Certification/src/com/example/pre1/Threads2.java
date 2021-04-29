package com.example.pre1;

public class Threads2 implements Runnable{

	@Override
	public void run() {

		System.out.println("run");
		throw new RuntimeException("Problem");
	}
	
	public static void main(String args[])
	{
		
		Thread t=new Thread(new Threads2());
		t.start();
		System.out.println("End of The Method");
	}

}

