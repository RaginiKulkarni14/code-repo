package com.example.pre2;

class SuperCals{
	protected int multiply(int a,int b) {
		//protected static int multiply(int a,int b) {	//Cannot use super in a static context
		return a*b;
	}
}
public class SubCals extends SuperCals{
	
	public int multiply(int a,int b) {
	//public static int multiply(int a,int b) {	//Cannot use super in a static context
		int c=super.multiply(a,b);
		return c;
	}

	public static void main(String[] args) {
		SubCals sb=new SubCals();
		System.out.println(sb.multiply(4, 3));
	}

}
