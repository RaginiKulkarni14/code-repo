package com.java.basic.introduction;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		
		BigInteger add=a.add(b);
		BigInteger mul=a.multiply(b);
		
		System.out.println(add+"\n"+mul);
		
		
	}

}
