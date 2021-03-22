package com.example.basicOp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestSort {

	public static void main(String[] args) {

		Set ts=new TreeSet(new MyComapartor());
	
		//ts.add(10); ts.add(5); ts.add(20); ts.add(15); System.out.println(ts);
		
	//	ts.add(new StringBuffer("A"));
		
		ts.add("A");
		ts.add("o");
		ts.add("Z");
		ts.add("C");
		ts.add("a");
		System.out.println(ts);
		
	}

}

class MyComapartor implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		/*
		 * Integer i1=(Integer) o1; 
		 * Integer i2=(Integer) o2; 
		 * //return -i1.equals(i2) //also returns in reverse order 
		 * if(i1 < i2) return 1; 
		 * else
		 *  if(i1 > i2) 
		 *  return-1; 
		 *  return 0;
		 */
		
		String s1=(String) o1;
		String s2=o2.toString(); //can be used incase of String buffer
		return s1.compareTo(s2);
	}
}
