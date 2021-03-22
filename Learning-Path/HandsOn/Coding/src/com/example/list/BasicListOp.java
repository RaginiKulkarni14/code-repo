package com.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicListOp {

	public static void main(String[] args) {

		//fixed size list
		List<Integer> al = Arrays.asList(new Integer[10]);
		al.set(3, 10);
		
		//synchronizedList
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("hi");
		list.add("hello");
	}

}
