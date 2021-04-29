package com.example.pre1;

/*
While using the varargs, you must follow some rules otherwise program code won't compile. The rules are as follows:

    There can be only one variable argument in the method.
    Variable argument (varargs) must be the last argument.

 */

public class Barn {

	public static void main(String[] args) {
		new Barn().go("hi");
		//new Barn().go(1,"hi"); //public void go(int i,String... y)
		new Barn().go("hi","world");
	}

	public void go(String... y) {
		System.out.println(y[y.length-1] + " ");
		
		//void method(String... a, int... b){}//Compile time error  
		  
		//void method(int... a, String b){}//Compile time error  
	}

}
