package com.java.basic.introduction;

/* You are given an integer n, you have to convert n it into a string s. If your code successfully converts
into a string the code will print "Good job". Otherwise it will print "Wrong answer".

Sample Input 0

100

Sample Output 0

Good job */

public class IntToString {

	public static void main(String[] args) {
		
		String str = "1234";
		int inum = Integer.parseInt(str);
		int inum2 = Integer.valueOf(str);

		int n = 10;

		String s = Integer.toString(n);

		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer.");
		}

	}

}
