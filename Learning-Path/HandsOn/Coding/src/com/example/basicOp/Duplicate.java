package com.example.basicOp;

public class Duplicate {

	public static void main(String args[]) {

		int arr[] = { 1, 3, 1, 4, 6, 2 };
		int count = 0;
		System.out.println("length:" + (arr.length - 1) + ":" + arr[arr.length - 1]);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] == arr[j + 1]) {
					System.out.println(arr[i]);
					count++;
				}
			}
		}
		System.out.println(count + ":count");
	}

}
