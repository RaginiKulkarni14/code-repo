package com.example.inheritance;
class A {
	public static String msg() {
		return "ofss";
	}

}

class B extends A {
	public static String msg() {
		return "oracle";
	}
}

public class CastingObj {
	public static void main(String[] args) {
		A a = new B(); 
		B b = (B) a;
		System.out.println(a.msg());
		System.out.println(b.msg());
		
		//B b=a;  wont work //different class reference 
		//B b=(B) a;  works, b.msg prints oracle //downcasting
		
		//A a=new A();
		//B b=(B) a(); //will throw classcastexcp
	}
}
