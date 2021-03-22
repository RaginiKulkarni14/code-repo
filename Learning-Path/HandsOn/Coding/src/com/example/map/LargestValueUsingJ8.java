package com.example.map;

import java.util.Map.Entry;
import java.util.*;

public class LargestValueUsingJ8 {
	
	//Using lambda
	public static <K, V extends Comparable<V>> V maxUsingStreamAndLambda(Map<K, V> map) {
	    Optional<Entry<K, V>> maxEntry = map.entrySet()
	        .stream()
	        .max((Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue()
	            .compareTo(e2.getValue())
	        );
	    
	    return maxEntry.get().getValue();
	}
	
	//using collections.max()
	public static <K, V extends Comparable<V>> V maxUsingCollectionsMaxAndLambda(Map<K, V> map) {
	    Entry<K, V> maxEntry = Collections.max(map.entrySet(), (Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue()
	        .compareTo(e2.getValue()));
	    return maxEntry.getValue();
	}
	
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("ABC", 10);
		map.put("DEF", 30);
		map.put("XYZ", 20);

		//print(map);

		System.out.println("Entry with highest key: " + maxUsingStreamAndLambda(map));
		
		System.out.println("Entry with highest key: " + maxUsingCollectionsMaxAndLambda(map));
	}

}
