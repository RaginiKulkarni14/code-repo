package com.example.constructor;

class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
    	int i,j;
    	//i=m--;
    	//j=--m;
    	//System.out.println("m-- : "+i+":"+"--m : "+j);
        return m-- + --m;
    }
}
 
public class MainClass2
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}