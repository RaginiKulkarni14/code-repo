package com.java.basic.string;

import java.util.Scanner;

/*
Given two strings of lowercase English letters A, and B , perform the following operations: 
1) Sum the lengths of A and B.
2) Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
3) Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

public class StringsIntroduction {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = A.length()+B.length();
        
        System.out.println(sum);
        
        int result = A.compareTo(B);
        
        if(result < 0)
        {
        	System.out.println("No");
        }
        else if(result > 0)
        {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("Equal");
        }
        
        String capitalA = A.substring(0, 1).toUpperCase()+A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase()+B.substring(1);
        
        System.out.println(capitalA+" "+capitalB);

	}

}
