package com.basic.oop;

class Arithmetic {
	public String add(int i, int j) {
		return (i + j) + "";
	}
}

class Adder extends Arithmetic {

}

public class InheritanceI {

	public static void main(String[] args) {

		Adder a = new Adder();

		// Print the name of the superclass on a new line
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

		// Print the result of 3 calls to Adder's `add(int,int)` method as 3
		// space-separated integers:
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");

	}

}
