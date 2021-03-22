package com.example.set;

//SortedSet is an interface.
//Java program to demonstrate the 
//Sorted Set 

import java.util.*; 

public class SortedtreeSetEx  { 

	public static void main(String[] args) 
	{ 

		// create an instance of sortedset 
		SortedSet<String> ts = new TreeSet<String>(); 

		// Adding elements into the TreeSet 
		// using add() 
		ts.add("Sravan"); 
		ts.add("Ojaswi"); 
		ts.add("Bobby"); 
		ts.add("Rohith"); 
		ts.add("Gnanesh"); 
		ts.add("Devi2"); 

		// Adding the duplicate 
		// element 
		ts.add("Sravan"); 

		// Displaying the TreeSet 
		System.out.println(ts); 

		// Removing items from TreeSet 
		// using remove() 
		ts.remove("Ojaswi"); 

		// Iterating over Tree set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = ts.iterator(); 
		while (i.hasNext()) 
			System.out.println(i.next()); 
	} 
}
