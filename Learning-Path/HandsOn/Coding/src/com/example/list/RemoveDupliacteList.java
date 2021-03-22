package com.example.list;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupliacteList {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(2);

		List<Integer> newlist = new ArrayList<>();

		// remove duplicates using extended for-loop
		for (Integer list : al) {
			if (!newlist.contains(list)) {
				newlist.add(list);
			}
		}
		System.out.println(newlist);

		// remove duplicates using stream.distinct

		List<Integer> newallist = al.stream().distinct().collect(Collectors.toList());
		System.out.println(newallist);
	}

}
