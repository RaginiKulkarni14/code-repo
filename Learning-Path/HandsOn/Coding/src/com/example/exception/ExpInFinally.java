package com.example.exception;

public class ExpInFinally {

	// Exception in the finally block does not get caught/handled. Hence, terminate
	// the java virtual machine. As a result code does not print D and E.

	public static void main(String args[]) {
		try {
			System.out.print("A");
			throw new Exception();
		} catch (Exception e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
			int num = 7 / 0;
			/*
			 * try { int num = 7 / 0; } catch (ArithmeticException e) {
			 * System.out.print("B"); }
			 */
			System.out.print("D");
		}
		System.out.print("E");
	}

}
