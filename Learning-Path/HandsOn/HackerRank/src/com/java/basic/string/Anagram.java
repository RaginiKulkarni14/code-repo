package com.java.basic.string;

public class Anagram {

	public static void main(String[] args) {
		
		String a="aat";
		String b="tac";
		
		boolean result=isAnagram( a,  b);
		
		System.out.println(result  ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {

			String A = a.toLowerCase();
			String B = b.toLowerCase();

			char temp;
			char string1[] = A.toCharArray();
			int len = string1.length - 1;

			// Sort character in an array
			for (int i = 0; i <= len; i++) {
				for (int j = i + 1; j <= len; j++) {
					if (string1[i] > string1[j]) {
						temp = string1[i];
						string1[i] = string1[j];
						string1[j] = temp;
					}
				}
			}

			// Sort character in an array
			char string2[] = B.toCharArray();

			for (int i = 0; i <= len; i++) {
				for (int j = i + 1; j <= len; j++) {
					if (string2[i] > string2[j]) {
						temp = string2[i];
						string2[i] = string2[j];
						string2[j] = temp;
					}
				}
			}

			boolean flag = true;
			for (int i = 0; i < len; i++) {
				if (string1[i] != string2[i]) {
					flag = false;
				}
			}
			return flag;
		} else {

			return false;
		}
	}
}
