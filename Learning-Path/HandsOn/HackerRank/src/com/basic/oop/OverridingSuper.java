package com.basic.oop;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me(); //for parent class

		//String temp=this.define_me(); //for current class
		
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
public class OverridingSuper {

	public static void main(String[] args) {

		MotorCycle M=new MotorCycle();
		
	}

}
