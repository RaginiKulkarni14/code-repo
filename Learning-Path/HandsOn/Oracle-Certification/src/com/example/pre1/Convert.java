package com.example.pre1;

public class Convert {
	
	public static void parse(String str)
	{
		try
		{
			float f=Float.parseFloat(str);
			System.out.println(f);
		}
		catch(NumberFormatException nfe)
		{
			//f=0;
		}
		finally
		{
			System.out.println();
		}
	}

	public static void main(String[] args) {
		parse("msg");

	}

}
