package com.basic.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorEx {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      for(int i = 0;i<n;i++){
	         mylist.add(sc.nextInt());
	      }
	      
	      mylist.add("###");
	      for(int i=0;i<m;i++){
	         mylist.add(sc.next());
	      }
	      
	      Iterator it=func(mylist);
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println((String)element);
	      }
		
	}

	private static Iterator func(ArrayList mylist) {
		Iterator it=mylist.iterator();
	      while(it.hasNext()){
	         //Object element = ~~~Complete this line~~~
	        // if(~~~Complete this line~~~)//Hints: use instanceof operator
	         Object element = it.next();
	     if(element.equals("###"))
	        //break;

				break;
			}
	      return it;
	}

}
