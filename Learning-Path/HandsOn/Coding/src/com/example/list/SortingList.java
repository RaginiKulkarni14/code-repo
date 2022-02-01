package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(2);
		
		System.out.println(al.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(al.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
		//descending order
		Collections.sort(al,Collections.reverseOrder());
		//Collections.reverseOrder();
		
		System.out.println(al);
		
		List<Integer> reverseal = new ArrayList<>();

		// resversing list using for loop
		for (int i = al.size() - 1; i >= 0; i--) {
			reverseal.add(al.get(i));
		}
		System.out.println(reverseal);

		// reversing list using collection
		Collections.reverse(al);
		System.out.println(al);
	}

}
