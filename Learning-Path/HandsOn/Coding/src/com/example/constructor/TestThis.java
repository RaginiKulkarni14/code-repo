package com.example.constructor;

class P
{
    int i = 51;
 
    public P(int j)
    {
        System.out.println(i);
 
        this.i = j * 10;
    }
}
 
class Q extends P
{
    public Q(int j)
    {
        super(j);
 
        System.out.println(i);
 
        this.i = j * 20;
    }
}
 
public class TestThis
{
    public static void main(String[] args)
    {
        Q q = new Q(26);
 
        System.out.println(q.i);
    }
}