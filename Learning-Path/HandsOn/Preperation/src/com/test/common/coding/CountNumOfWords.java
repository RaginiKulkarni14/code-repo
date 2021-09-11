package com.test.common.coding;

public class CountNumOfWords {

	public static void main(String[] args) {

		String msg = "hellow world!!";
		char ch[]=msg.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
