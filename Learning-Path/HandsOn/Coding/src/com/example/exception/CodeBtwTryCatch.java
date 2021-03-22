package com.example.exception;

public class CodeBtwTryCatch {

	public static void main(String args[]) {
		try {
			System.out.print("A");
			int num = 99 / 0;
			System.out.print("B");
		}

		// System.out.print("C");
		// Compilation Error : You can not have code between try, catch or finally
		// blocks.

		catch (ArithmeticException ex) {
			System.out.print("D");
		}
	}

}
