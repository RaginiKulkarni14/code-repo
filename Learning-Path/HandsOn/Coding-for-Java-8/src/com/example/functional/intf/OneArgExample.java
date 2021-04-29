package com.example.functional.intf;

interface Greeting {
	void greetings(String msg);
}

public class OneArgExample {

	public static void main(String[] args) {

		// anonymous class
		/*Greeting greeting = new Greeting() {
			@Override
			public void greetings(String msg) {
				System.out.println("Hello "+msg );
			}
		};
		greeting.greetings("from anonymous class"); */
		
		//using lambda exp
		Greeting greetings = (msg) -> System.out.println("Hello "+msg);
		greetings.greetings("from anonymous class");
	}

}
