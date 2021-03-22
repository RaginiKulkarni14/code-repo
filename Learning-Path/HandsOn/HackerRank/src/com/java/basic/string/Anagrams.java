package com.java.basic.string;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str="tat";
		String str2="tac";
		
		char[] ch=str.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch, ch2))
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
		
		
		
	}

}
