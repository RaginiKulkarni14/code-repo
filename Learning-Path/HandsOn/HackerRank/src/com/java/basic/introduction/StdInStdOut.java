package com.java.basic.introduction;

/*
 Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

 */

import java.util.Scanner;

public class StdInStdOut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + in);
        
 //*******************************************************************************************************     
    
//In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. 
        
        for(int i=0;i<3;i++)
        {
            int a = scan.nextInt();
            System.out.println(a);
        }

       
    }

}
