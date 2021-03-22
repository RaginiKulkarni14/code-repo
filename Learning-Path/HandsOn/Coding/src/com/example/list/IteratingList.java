package com.example.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratingList {

	public static void main(String[] args) {

		// Creating a list for String objects
		List<String> al = new ArrayList<>();

		// adding elements to list using add()
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");

		// iterating list using simple for-loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// iterating list using extended for-loop
		for (String element : al) {
			System.out.println(element);
		}

		// iterating list with for-each and lamda-expression
		al.forEach(list -> System.out.println(list));

		// iterating list using iterator
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// iterating list using list-iterator
		//ListIterator - traverse a list of elements in either forward or backward order
		//it performs operations like hasNext() next() nextIndex(), hasPrevious() previous() previousIndex(), add() set()
		ListIterator<String> lit = al.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		//iterating list using while
		int j=0;
		while(j< al.size())
		{
			System.out.println(al.get(j));
			j++;
		}

	}

}
