package com.example.functional.intf;

interface Print {
	public void msg();
}

public class NoArgExample {

	public static void main(String arg[]) {
		
		//anonymous class
		/*Print printing = new Print() {
			@Override
			public void msg() {
				System.out.println("hello.....");
			}
		};
		printing.msg(); */
		
		//using lambda exp
		Print printing = () -> System.out.println("hello....");
		printing.msg();
	}

}
