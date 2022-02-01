package com.example.map;

import java.util.*;

public class MultiMapEx {

	public static void main(String[] args) {

		Map<List<String>,Integer> map=new HashMap<List<String>,Integer>();
		
		Integer i=10;
		int j=10;
		System.out.println(call(i));
		System.out.println(call2(j));
		System.out.println(i++);
		System.out.println(i);
		
		
		
	}
	
	public static Integer call(Integer i)
	{
		return ++i;
	}
	
	public static int call2(int i)
	{
		return i++;
	}

}
