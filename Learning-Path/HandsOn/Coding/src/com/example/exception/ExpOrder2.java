package com.example.exception;

class Base extends Exception {}
class Derived extends Base  {}
 
public class ExpOrder2 {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
   
   catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
   
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
   
   //order of super class exp should be at the end and derived exp should appear first
	/*
	 * catch(Derived d) { System.out.println("Caught derived class exception"); }
	 */
  }
} 