package com.example.exception;

public class SubClassException {

}
class SubException extends Exception { } 

class SubSubException extends SubException { } 

 class JH 
{ 
    public void doStuff() throws SubException {} 
} 
class JH2 extends JH 
{
    public  void doStuff() throws SubSubException {} 
} 
class JH3 extends JH 
{
	//An overriding method can not throw a broader exception
    //public  void doStuff() throws Exception {} -- compilation fails here
	//but it can throw unchecked Exception
    public  void doStuff() throws ArithmeticException {} 
}
class JH4 extends JH 
{
    public  void doStuff(int x) throws Exception {} 
}
class JH5 extends JH 
{
    public  void doStuff()  {} 
}

