package com.example.exception;

public class ExpNotHandled {

	// After printing A, Exception thrown in try block is not caught and hence
	// propagate to finally block. As we know finally block is always executed
	//  hence, it will print C. It will not
	// print D since the exception thrown by try block is not caught/handled.

	public static void main(String args[]) {
		try {
			System.out.print("A");
			int num = 99 / 0;
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

}
