package com.test.common.coding;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String msg = "hello world!!";
		String noSpace=msg.replaceAll("\\s", ""); //remove white space
		System.out.println(noSpace);
		char ch[]=msg.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == ' ' && ch[i]=='\t')
			{
				sb=sb.append(ch[i]);
			}
		}
		
	}

}
