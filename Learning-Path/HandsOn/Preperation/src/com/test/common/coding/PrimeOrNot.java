package com.test.common.coding;

public class PrimeOrNot {
	
	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53
	
	public static void main(String args[])
	{
		int num = 64;
		
		if(((num%2) == 0) && (num!=2) && (num!=1))
		{
			System.out.println("not prime num");
		}
		else
		{
			System.out.println("prime");
		}
	}

}
