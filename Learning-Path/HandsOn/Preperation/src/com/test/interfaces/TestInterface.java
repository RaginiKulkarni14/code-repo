package com.test.interfaces;

public interface TestInterface {
	
	default void foo()
	{
		System.out.println("foo");
	}

}
