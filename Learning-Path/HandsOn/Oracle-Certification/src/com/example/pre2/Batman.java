package com.example.pre2;

public class Batman {
	int square=81;
	public void go() {
		inc(++square);
		System.out.println(square);
	}
	 public int inc(int i) {
		return i+=10;
	}
	public static void main(String[] args) {
		new Batman().go();
	}

}
