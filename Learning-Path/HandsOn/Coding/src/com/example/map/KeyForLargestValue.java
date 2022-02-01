package com.example.map;

import java.util.*;
import java.util.Map.Entry;

public class KeyForLargestValue {
	
	 public static void main(String[] args)
	    {
	        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
	        map.put(1, 50);
	        map.put(2, 60);
	        map.put(3, 30);
	        map.put(4, 60);
	        map.put(5, 60);
	       System.out.println(map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)));
	        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
	        System.out.println(Collections.max(map.keySet()));
	        for (Entry<Integer, Integer> entry : map.entrySet()) {  // Iterate through hashmap
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println("loop : "+entry.getKey());     // Print the key with max value
	            }
	        }
	        
	        //Map<String, Integer> sorted = 
	        		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s -> System.out.println(s.getKey() +" " +s.getValue()));
	        
	        HashMap m=new HashMap();
	        m.put("1", "50");
	        m.put(2, 60);
	        m.put(3, 30);
	        m.put(4, 60);
	        m.put(5, 60);
	        //Set s=s.m.keySet();
	        

	    }

}
