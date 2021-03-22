package com.example.set;

//TreeSet is a concrete class.
//Java program to demonstrate the 
//TreeSet 

import java.util.*; 

public class UseOfTreeSet { 
	public static void main(String args[]) 
	{ 
		// Creating and adding elements 
		TreeSet<String> al = new TreeSet<String>(); 

		// Add elements 
		al.add("Welcome"); 
		al.add("to"); 
		al.add("Geeks for Geeks"); 

		// Traversing elements 
		Iterator<String> itr = al.iterator(); 
		while (itr.hasNext()) { 
			System.out.println(itr.next()); 
		} 
	} 
}
