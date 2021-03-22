package com.java.basic.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
       // String A=sc.next();
        
        String s ="madam";
        String cs="";
        int l=s.length()-1;
        
        for(int i=l;i>=0;i--)
        {
        	cs=cs+s.charAt(i);
        }
        System.out.println(cs);
        if(cs.equals(s))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("no");
        }
	}

}
