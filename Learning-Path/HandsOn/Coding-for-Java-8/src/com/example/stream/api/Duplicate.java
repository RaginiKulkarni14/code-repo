package com.example.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(2,3,4,1,5,6,3,5);
		
		Set<Integer> set=new HashSet<Integer>();
		
		System.out.println(list.stream().filter(n -> !set.add(n)).collect(Collectors.toList()));
		
		System.out.println(list.stream().filter(n -> !set.add(n)).collect(Collectors.toList()));
		
		List al=new ArrayList();
		
		al.add("q");
		al.add(2);
		al.add("3");
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * Set st=new TreeSet(); st.add(2); st.add("a");
		 */
		
		/*
		 * Iterator itt=st.iterator();
		 * 
		 * while(itt.hasNext()) { System.out.println(itt.next()); }
		 */
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		mp.put(1, 2);
		mp.put(3, 4);
		
		mp.entrySet().stream().forEach(m -> System.out.println(m));
		
		
	}

}
