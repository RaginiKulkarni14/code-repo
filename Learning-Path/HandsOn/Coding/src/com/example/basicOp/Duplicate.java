package com.example.basicOp;

public class Duplicate {

	public static void main(String args[]) {

		int arr[] = { 4, 3, 1, 4, 2, 2, 4 };
		int count = 1;
		// System.out.println("length:" + (arr.length - 1) + ":" + arr[arr.length - 1]);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
				}

			}
		}

	}

}
