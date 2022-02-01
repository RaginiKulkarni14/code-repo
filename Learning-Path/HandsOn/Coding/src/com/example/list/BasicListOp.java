package com.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class Test {
	int id;

	public Test(int id, String name, List<Integer> alist) {
		super();
		this.id = id;
		this.name = name;
		this.alist = alist;
	}

	String name;
	List<Integer> alist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getAlist() {
		return alist;
	}

	public void setAlist(List<Integer> alist) {
		this.alist = alist;
	}
	// Arrays.asList(3,4,1,2,4,3,5,6,7,4,3,2);
}

public class BasicListOp {

	public static void main(String[] args) {

		// fixed size list
		List<Integer> al = Arrays.asList(new Integer[10]);

		int az[] = { 1, 2, 3, 4 };

		List arrayList=Arrays.asList(az);

		List<Integer> arrayList2 = new ArrayList<Integer>(az.length);
		// Collections.addAll(arrayList2,az);

		for (Integer i : az) {
			arrayList2.add(i);
		}

		al.set(3, 10);

		List<Integer> alist = Arrays.asList(3, 4, 1, 2, 4, 3, 5, 6, 7, 4, 3, 2);
		
		alist.stream().sorted();
		
		System.out.println("max 5"+alist.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList()));

		System.out.println(alist.stream().distinct().filter(a -> a % 2 == 0).collect(Collectors.toList()));
		
		System.out.println(alist.stream().map(a -> a * 2).collect(Collectors.toList()));

		for (Integer i : alist) {
			System.out.println(i + ":" + Collections.frequency(alist, i));
		}

		System.out.println(alist.stream().count());

		Test t = new Test(1, "a", alist);
		Test t2 = new Test(2, "b", al);

		List<Test> lt = new ArrayList<Test>();
		lt.add(t2);
		lt.add(t);

		Set<Integer> list2 = lt.stream().flatMap(a -> a.getAlist().stream()).collect(Collectors.toSet());

		System.out.println(list2);

		// synchronizedList
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("hi");
		list.add("hello");

		List<Integer> arlist = new ArrayList<Integer>();

		arlist.add(1);
		arlist.add(11);

		for (Integer i : arlist) {
			// arlist.add(111); java.util.ConcurrentModificationException
			System.out.println(i);
		}

		CopyOnWriteArrayList<Integer> clist = new CopyOnWriteArrayList<Integer>();

		clist.add(1);
		clist.add(11);

		for (Integer i : clist) {
			clist.add(111); // will not throw any error
			System.out.println("copyOnWrite : " + i);
		}

	}

}
