package com.example.map;

//Java program to compare two HashMap objects 
import java.util.*;

public class MapObjects {
	public static void main(String[] args) {

		// New HashMap1
		HashMap<Integer, String> map1 = new HashMap<>();

		// Add Entry to map
		map1.put(1, "Akshay");
		map1.put(2, "Bina");
		map1.put(3, "Chintu");

		// New HashMap1
		HashMap<Integer, Integer> mapInt = new HashMap<>();

		// Add Entry to map
		mapInt.put(1, 5);
		mapInt.put(2, 6);
		mapInt.put(3, 1);
		
		System.out.println(mapInt.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue());

		System.out.println(mapInt.values() + ":" + mapInt.keySet());
		
		//Map<String, Integer> sorted = 
				map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
                
				//Collections.sort()
		
		// New HashMap2
		HashMap<Integer, String> map2 = new HashMap<>();

		// Add Entry to map
		map2.put(3, "Chintu");
		map2.put(2, "Bina");
		map2.put(1, "Akshay");

		// New HashMap3
		HashMap<Integer, String> map3 = new HashMap<>();

		// Add Entry to map
		map3.put(1, "Akshay");
		map3.put(2, "Binod");
		map3.put(3, "Chintu");

		// Compare map1 and map2
		System.out.println("map1 == map2 : " + map1.equals(map2));

		// Compare map1 and map3
		System.out.println("map1 == map3 : " + map1.equals(map3));
	}
}
