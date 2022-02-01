package com.example.constructor;

class M {
	 {
		System.out.println('A');
	}

	{
		System.out.println('B');
	}

	public M() {
		System.out.println('C');
	}
}

class N extends M {
	 {
		System.out.println('D');
	}

	{
		System.out.println('E');
	}

	public N() {
		System.out.println('F');
	}
}

public class MainClass {
	public static void main(String[] args) {
		N n = new N();
	}
}