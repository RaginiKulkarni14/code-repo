package com.example.pre1;

class Building {

}

public class Burn extends Building {

	public static void main(String[] args) {

		Building bld1 = new Building();
		Burn brn1 = new Burn();
	//	Burn brn2 = (Burn) bld1; // downcasting type casting error
		Building bld2 = (Building) brn1; // upcasting
		Object obj1 = (Object) bld1;
		// String str1 = (String)bld1; //casting error
	}

}
