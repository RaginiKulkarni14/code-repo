package com.java.basic.introduction;

/*
 The first column contains the String and is left justified using exactly 10 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================

Explanation

Each String is left-justified with trailing whitespace through the first
characters. The leading digit of the integer is the character, and each integer that was less than digits now has leading zeroes.
 */

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d %n", s1, x);   
        }
        System.out.println("================================");

	}

}
