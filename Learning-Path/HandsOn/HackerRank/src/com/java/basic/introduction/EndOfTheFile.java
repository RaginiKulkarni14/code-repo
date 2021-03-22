package com.java.basic.introduction;

/* The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.

 */

import java.util.Scanner;

public class EndOfTheFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int counter = 0; /// 1

		while (sc.hasNext()) {
			counter++;
			String line = sc.nextLine();
			System.out.println(counter + " " + line);
			// counter++;

		}

	}

}
