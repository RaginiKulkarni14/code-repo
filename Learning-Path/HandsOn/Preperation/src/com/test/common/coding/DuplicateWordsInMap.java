package com.test.common.coding;

import java.util.HashMap;

public class DuplicateWordsInMap {

	public static void main(String[] args) {

		String msg = "hi hello namaste hello hello hi";
		String[] split=msg.split(" ");
		for(String s:split)
		System.out.print(s);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<split.length;i++)
		{
			if(map.containsKey(split[i]))
			{
				int count=map.get(split[i]);
				map.put(split[i],count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}
