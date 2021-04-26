package com.example.pre2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface testagain
{
	default void msg()
	{
		System.out.println("hi");
	}
	
	static void msg2()
	{
		System.out.println("hi");
	}
	
	static void msg2(int a)
	{
		System.out.println("hi");
	}
	
}


public class TestExmple {

	public static void main(String[] args) {

		int x=1,y=1,z=0;
		if(x==y | x < ++y)
		{
			z=x+y;
		}
		else
		{
			z=1;
		}
		System.out.println(z);
		
		//******************************************
		
		System.out.println(8*8/2+2-3*2);
		
		//******************************
		
		String[] names= {"Mary","Jane","Eliz","Joe"};
		//Arrays.sort(names);
		//int x1=Arrays.binarySearch(names, "Ann");
		//System.out.println(x1);
		
		Arrays.sort(names, (s1,s2) -> { return s2.length() - s1.length(); } );
		for(String n : names)
		{
			System.out.println(n);
		}
		
		//***********************************
		
		String[] ar= {"tea"};
		List<String> al=Arrays.asList(ar);
		//al.add(e);
		
		//***********************************
		
		List<String> all=new ArrayList<String>();
		all.add("a");
		all.add("b");
		all.add(2,null);
		all.add(3,"a");
		all.add(2,"a"); //pushes he values down
		all.set(2, "c"); //update
		
		for(String alist : all)
		{
			System.out.println(alist);
		}
		
	}

}
