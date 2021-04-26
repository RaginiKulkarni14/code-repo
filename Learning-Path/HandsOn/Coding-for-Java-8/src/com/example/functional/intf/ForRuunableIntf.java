package com.example.functional.intf;

public class ForRuunableIntf {

	public static void main(String[] args) {

		//using anonymous class
	/*	Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Executing the run method...");
			}
		};
		Thread th = new Thread(runnable);
		th.start(); */
		
		//using lambda exp
		Runnable runnable = () -> System.out.println("Executing the run method");
		Thread th = new Thread(runnable);
		th.start();
	}

}
