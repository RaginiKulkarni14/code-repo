package com.example.map;

//Program to clone a Map in Java 
//Naive Method 
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
//needs gson-1.6.jar
//import com.google.gson.Gson; 

public class CloneAMap {
	public static void main(String[] args) {
		// Creating an object for class Map
		Map<Integer, String> hash_Map = new HashMap<Integer, String>();

		// putting elements into the map
		hash_Map.put(1, "Geeks");
		hash_Map.put(2, "For");
		hash_Map.put(3, "Geeks");

		// Creating a new object for
		// class Map to clone a map
		Map<Integer, String> new_map = new HashMap<Integer, String>();

		// using iterator
		for (Map.Entry<Integer, String> entry : hash_Map.entrySet()) {
			new_map.put(entry.getKey(), entry.getValue());
		}

		System.out.println(new_map);

		// using putAll()
		new_map.putAll(hash_Map);

		System.out.println(new_map);

		// using copyContructor
		new_map = new HashMap<>(hash_Map);
		System.out.println(new_map);

		// using java8
		new_map = hash_Map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(new_map);
		
		//using JSON
		/*
		 * Gson gson = new Gson();
		 * 
		 * String jsonString = gson.toJson(hash_Map);
		 * 
		 * new_map = gson.fromJson(jsonString, Map.class);
		 * 
		 * System.out.println(new_map);
		 */
	}
}
