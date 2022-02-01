package com.example.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregateFn {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 0, 3, 4);
		  
	        // Using stream.min() to get minimum
	        // element according to provided Integer Comparator
	        Integer var = list.stream().min(Integer::compare).get();
	        System.out.println(list.stream().min(Integer::compare).get());
	  
	        System.out.println(var);
	        
	        Integer mx=list.stream().max(Integer::compare).get();
	        System.out.println(mx);
	        
	        List<String> slist=Arrays.asList("agy","Byf","Byf","yt","Aytf","Aytf","cytf","zytf");
	        
	       // Stream<String> stre=slist.forEach(word -> StringUtils.capitalize(word));
	        
	        //System.out.println(stre);
	        
	        Stream<String> st=slist.stream().map(String::toUpperCase);
	        
	        System.out.println(st.collect(Collectors.toList()));
	        
	        Predicate<String> start= a -> a.startsWith("a");
	        
	        System.out.println(slist.stream().anyMatch(k -> k.startsWith("a")));
	        
	       System.out.println(slist.hashCode());
	       
	       System.out.println(slist.stream().max(Comparator.comparing(String::valueOf)).get());
	       
	      System.out.println(slist.stream().distinct().collect(Collectors.toList()));
	      
	      Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
	      System.out.println("sum : "+sum);
	      System.out.println(list.stream().count());
	      System.out.println(list.stream().mapToInt(Integer::intValue).sum());
	      
	      System.out.println(list.stream().mapToInt(Integer::intValue).max());
	      
	      Optional<Integer> result = list
	    	      .stream().parallel()
	    	      .filter(num -> num < 4).findAny();
	      System.out.println(result);
	      
	      Optional<String> result2 = slist
	    	      .stream().parallel()
	    	      .filter(val -> val.equals("yt")).findAny();
	      System.out.println(result2);
	      //slist.stream().new
	}

}
