package com.java.basic.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int q,x,y;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		
		 q=sc.nextInt();
		for(int j=0;j<q;j++)
		{
			String twoQ=sc.next();
			if(twoQ.equals("Insert"))
			{
				x=sc.nextInt();
				y=sc.nextInt();
				al.add(x, y);
			}
			else 
			{
				x=sc.nextInt();
				al.remove(x);
			}
		}
		
		for(Integer list:al)
		{
			System.out.print(list + " ");
		}
		
	}

}
