package com.example.pre1;

class Atom
{
	Atom()
	{
		System.out.println("atom");
	}
}
class Rock extends Atom
{
	Rock(String type){
		System.out.println(type);
	}
}

public class Mountain extends Rock {

	Mountain()
	{
		super("granite");
		new Rock("granite2");
	}
	
	public static void main(String[] args) {
		new Mountain();
	}

}
