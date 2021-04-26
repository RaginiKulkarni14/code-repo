package com.example.pre1;

interface Foo {
}

class Alpha implements Foo {

}

class Beta extends Alpha {

}

public class Delta extends Beta {

	public static void main(String[] args) {

		Beta x=new Beta();
		Alpha a=x;
		Foo f=(Alpha)x;
		//Foo f=(Delta)x; //class cast exp
		Beta b=(Beta)(Alpha)x;
		
	}

}
