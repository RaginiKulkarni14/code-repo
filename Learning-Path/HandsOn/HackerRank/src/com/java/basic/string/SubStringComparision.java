package com.java.basic.string;

public class SubStringComparision {

	public static void main(String[] args) {

		String s = "welcometojava";
		int k = 3;
		getSmallestAndLargest(s, k);
		System.out.println(getSmallestAndLargest(s, k));

	}

	public static String getSmallestAndLargest(String s, int k) {
		String currStr = s.substring(0, k);
		String smallest = currStr;
		String largest = currStr;

		for (int i = k; i < s.length(); i++) {
			//System.out.println(currStr.substring(1, k)+":"+s.charAt(i));
			currStr = currStr.substring(1, k) + s.charAt(i);
			
			if (largest.compareTo(currStr) < 0)
				largest = currStr;
			if (smallest.compareTo(currStr) > 0)
				smallest = currStr;
		}
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		/*
		 * while (s.length() >= k) { String l = s.substring(0, k);
		 * System.out.println(l); s = s.substring(1); }
		 */

		// System.out.println(l);

		return smallest + "\n" + largest;
	}

}
