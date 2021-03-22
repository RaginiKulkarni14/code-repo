package com.example.map;

//Java program to illustrate 
//the Map size() Method 
import java.util.*;

public class MapSizeExample {

	// Main Method
	public static void main(String[] args) {
		Map map = new HashMap();

		// Adding key-values
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");

		// using the method
		System.out.println("Size of the map is : " + map.size());

		// for generics
		Map<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		map2.put(4, "four");

		// using the method
		System.out.println("Size of map is :" + map2.size());
	}
}
