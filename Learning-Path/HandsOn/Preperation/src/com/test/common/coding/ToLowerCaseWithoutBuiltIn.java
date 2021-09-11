package com.test.common.coding;


/*we know ASCII value of ‘b’ is 98 and that of uppercase character ‘B’ is 66.

Here the difference between uppercase and lowercase character is 32. So we have to add 32 to uppercase character*/

public class ToLowerCaseWithoutBuiltIn {

	public static void main(String[] args) {

		String str = "hi";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] >= 'A' && ch[i] <= 'Z' )
			{
				ch[i] = (char) (ch[i] +32) ;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
