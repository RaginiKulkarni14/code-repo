package com.example.constructor;

class Super
{
	Super()
	{
		System.out.println("Super no arg const");
	}
	
}

public class Subclass extends Super{
	
	Subclass()
	{
		System.out.println("Subclass no arg const");
	}
	
	Subclass(String msg)
	{
		System.out.println("Subclass  arg const : "+msg);
	}
	
	void display()
	{
		System.out.println("Hello ");
	}

	public static void main(String[] args) {

		Subclass sub=new Subclass();
		sub.display();
		Subclass sub2=new Subclass("hi");
		sub2.display();

	}

}
