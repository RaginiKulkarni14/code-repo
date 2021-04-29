package com.example.functional.intf;

import java.util.ArrayList;

public class ConsumerIntfList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("C++");
		al.add("Java");
		
		//traditional way
		for(String st : al)
		{
			System.out.println(st);
		}
		
		//using lambda
		al.forEach(element -> System.out.println(element));
	}

}
