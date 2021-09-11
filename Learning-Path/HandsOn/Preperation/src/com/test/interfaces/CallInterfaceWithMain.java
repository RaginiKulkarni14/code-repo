package com.test.interfaces;

public class CallInterfaceWithMain extends TestAbstractClass{

	@Override
	void test() {
		System.out.println("test");
	}
	
	@Override
	 public void getStringM(String k)
	 {
		 System.out.println("helloo"+k);
	 }

}
