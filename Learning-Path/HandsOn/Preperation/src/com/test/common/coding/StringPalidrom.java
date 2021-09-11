package com.test.common.coding;

public class StringPalidrom {

	public static void main(String[] args) {

		String a="madam";
		
		char[] c=a.toCharArray(); // m a d a m
		
		StringBuffer b=new StringBuffer();
		
		for(int i=0;i<c.length;i++)
		{
			char ch=c[i];
			if(i%2==0)
			{
				ch=Character.toUpperCase(ch);
			}
	b.append(ch);
		}
		System.out.println(b.toString());
	}

}
