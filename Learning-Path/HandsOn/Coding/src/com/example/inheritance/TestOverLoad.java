package com.example.inheritance;

public class TestOverLoad {

	public void show(Object a)
	{
		System.out.println("obj");
	}
	public void show(int a)
	{
		System.out.println("int");
	}
	
	public void show(String a)
	{
		System.out.println("str");
	}
	
	//public void show(Integer a)
	{
		System.out.println("Integer");
	}
	
	
	
	public static void main(String[] args) {

		TestOverLoad t=new TestOverLoad();
		
		t.show(null);
		
	}

}
