package com.example.list;

import java.util.*;
import java.util.stream.*;

public class StringToList {

	public static void main(String[] args) {
	
		String str="reverse me";
		List<Character> al=new ArrayList<Character>();
		
		for(Character c:str.toCharArray())
		{
			al.add(c);
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.print(al.stream().map(String::valueOf).collect(Collectors.joining()));

	}

}
