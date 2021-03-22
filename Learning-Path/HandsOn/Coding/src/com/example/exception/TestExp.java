package com.example.exception;

class Test extends Exception { }

public class TestExp {

	public static void main(String[] args) {
		try {
			//subclass of throwable can be used not primitives
			//throw 10;
		} 
		//
		//catch (int e) primitives are not allowed
		catch(Exception e)
		{
			System.out.println("Got the  Exception " + e);
		}
		
		try {
	         throw new Test();
	      }
	      catch(Test t) {
	         System.out.println("Got the Test Exception");
	      }
	      finally {
	         System.out.println("Inside finally block ");
	      }
	}

}
