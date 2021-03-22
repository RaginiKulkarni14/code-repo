package com.example.map;

//Java program to find entry 
//with highest key in a map 

import java.util.*;

public class LargestKey {

	// Find the entry with highest key
	public static <K extends Comparable<K>, V> Map.Entry<K, V> getMaxEntryInMapBasedOnKey(Map<K, V> map) {
		// To store the result
		Map.Entry<K, V> entryWithMaxKey = null;

		// Iterate in the map to find the required entry
		for (Map.Entry<K, V> currentEntry : map.entrySet()) {

			if (

			// If this is the first entry,
			// set the result as this
			entryWithMaxKey == null

					// If this entry's key is more than the max key
					// Set this entry as the max
					|| currentEntry.getKey().compareTo(entryWithMaxKey.getKey()) > 0) {

				entryWithMaxKey = currentEntry;
			}
		}

		// Return the entry with highest key
		return entryWithMaxKey;
	}

	// Print the map
	public static void print(Map<String, Integer> map) {

		System.out.print("Map: ");

		// If map does not contain any value
		if (map.isEmpty()) {
			System.out.println("[]");
		}

		else {
			System.out.println(map);
		}
	}

	// Driver code
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("ABC", 10);
		map.put("DEF", 30);
		map.put("XYZ", 20);

		print(map);

		System.out.println("Entry with highest key: " + getMaxEntryInMapBasedOnKey(map));
	}
}
