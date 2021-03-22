package com.example.set;

import java.util.*;
import java.util.stream.Collectors; 

public class ConvertListToSet { 
    public static void main(String[] args) 
    { 
  
        // Creating a list of strings 
        List<String> aList = Arrays.asList("Geeks", "for", 
                     "GeeksQuiz", "GeeksforGeeks", "GFG"); 
  
        Set<String> hSet = new HashSet<String>(); 
        for (String x : aList) 
            hSet.add(x); 
  
        System.out.println("Created HashSet is"); 
        for (String x : hSet) 
            System.out.println(x); 
        
     // Converting to set using stream 
        Set<String> set = aList.stream().collect(Collectors.toSet()); 
  
        for (String x : set) 
            System.out.println(x); 
  
        // We can created TreeSet same way 
        System.out.println("Created TreeSet is"); 
        Set<String> tSet = new TreeSet<String>(aList); 
       // tSet.addAll(aList); using addAll method
        System.out.println("Created TreeSet is"); 
        for (String x : tSet) 
            System.out.println(x); 
    } 
} 