package com.example.list;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertSetToList {
	
	public static void main(String[] args) { 
		  
	    // Creating a hash set of strings 
	    Set<String> s = new HashSet<String>(); 
	    s.add("Geeks"); 
	    s.add("for"); 
	  
	    int n = s.size(); 
	    List<String> aList = new ArrayList<String>(n); 
	    for (String x : s) 
	      aList.add(x); 
	  
	    System.out.println("Created ArrayList is"); 
	    for (String x : aList) 
	      System.out.println(x); 
	    
	    //using streams
	    List<String> arList = s.stream().collect(Collectors.toList()); 
	    
	    for (String x : arList) 
	      System.out.println(x); 
	  
	    // We can created LinkedList same way 
	    System.out.println("Created LinkedList is"); 
	    List<String> lList = new LinkedList<String>(s);       
	    for (String x : lList) 
	      System.out.println(x);  
	  } 

}
