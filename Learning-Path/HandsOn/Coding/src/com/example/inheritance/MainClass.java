package com.example.inheritance;

class Parent{ 
	 public int var = 10;
	 
	 public void print(){ 
	  int var = 20;
	   
	  System.out.println("I am Parent 1:"+var);
	  System.out.println("I am Parent 2:"+this.var);
	 }
	}

	class Child extends Parent{ 
	 public int var = 30;
	 
	 public void print(){ 
	  int var = 40;
	   
	  System.out.println("I am Child 1:"+var);
	  System.out.println("I am Child 2:"+this.var);
	  System.out.println("I am Child 3:"+super.var);
	 } 
	}

	public class MainClass {

	 public static void main(String[] args) {
	  Parent p = new Parent();
	  System.out.println(p.var);
	  p.print();
	  System.out.println("---------------");
	  
	  Child c = new Child();
	  System.out.println(c.var);
	  c.print();
	  System.out.println("---------------");
	  
	 // Child cp=p; not allowed
	  
	  //Parent pc = new Child(); //(OR p = c)
	  Parent pc=c;
	  System.out.println(pc.var);
	  pc.print();
	  System.out.println("---------------");
	 }
	}