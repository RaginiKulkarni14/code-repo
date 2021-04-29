package com.example.pre1;

public interface A {
	public void doSomething(String msg);
}

class AImpl implements A {
	@Override
	public void doSomething(String msg) {
	}
}

class B {
	public A doit() {
		return null;
	}
	public String execute() {
		return null;
	}
}

class C extends B
{
	public AImpl doit()
	{
		return null;
	}
	public String execute() //int,Object//compilation fails if overriding with diff return type
	{
		return null;
	}
}