package com.example.exception;

public class ExpOrder {

	// All catch blocks must be arranged from most specific to more general. If you
	// have a catch clause for both ArrayIndexOutOfBoundsException and Exception ,
	// you must put the catch for ArrayIndexOutOfBoundsException first in your code.
	// Otherwise ArrayIndexOutOfBoundsException would be caught by catch(Exception
	// e), because a catch argument can catch the specified exception or its
	// subtypes. As a result compiler will stop you from defining catch clauses that
	// can never be reached.

	public static void main(String args[]) {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= 5; i++) {
				System.out.print("Array elements are : " + arr[i] + "\n");
			}
		}

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException : " + ex);
		}

		catch (Exception e) {
			System.out.println("Exception : " + e);
		}

		// Compilation fails : exception ArrayIndexOutOfBoundsException has already been
		// caught
		/*
		 * catch (ArrayIndexOutOfBoundsException ex) { System.out.println
		 * ("ArrayIndexOutOfBoundsException : "+ ex); }
		 */
	}
}
