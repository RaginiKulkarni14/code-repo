package com.example.pre1;

public class TestF {
	//Integer i; //un initailized non-prim values will be null, will give NPE
	Integer i=new Integer(0);
	int x;
	public TestF(int y)
	{
		x=i+y;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Float pi=new Float(3.14);
		if(pi>3) {
			System.out.println("grater");
		}else {
			System.out.println("not graeter");
		}
		
/************************************************************************************/		
		
		new TestF(new Integer(4));
		
	}

}
