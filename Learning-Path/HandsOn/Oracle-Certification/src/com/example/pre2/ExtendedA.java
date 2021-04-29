package com.example.pre2;

class ClassA{
	public int numOfInst;
	protected ClassA(int noi) {
		this.numOfInst=noi;
	}
}

public class ExtendedA extends ClassA {

	private ExtendedA(int noi) {
		super(noi);
	}
	public static void main(String[] args) {
		ExtendedA ea=new ExtendedA(420);
		System.out.println(ea.numOfInst);
	}

}
