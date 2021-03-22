package com.example.basicOp;

public class OpString {

	public static String concat1(String s1) {
		s1 = s1 + "forgeeks";
		return s1;
	}

	public void concat2(String s1) {
		s1 = s1 + "forgeeks";
	}

	public static void main(String[] args) {
		String s2 = "hello";
		s2 = s2 + "world";
		
		int i = 10;
		String l = null;
		l.valueOf(i); 									//converting int to string
		int k = Integer.parseInt("10"); 				//storing 

		String val = "10";

		System.out.println(val);

		System.out.println(s2);

		String s1 = "Geeks";
		concat1(s1); 									// s1 is not changed
		System.out.println("String: " + s1);
		OpString st = new OpString();
		st.concat2(s1); 								// s1 is not changed
		System.out.println("String: " + s1);

		StringBuffer sb = new StringBuffer("three");
		String ob1 = "onetwo";
		String obj3 = "one";
		String ob = "two";
		String obj4 = new String("two");
		String obj = new String(obj3 + obj4);
		String obj5 = obj3 + ob;

		sb.append(s1);

		ob = ob + "four";

		System.out.println(ob);

		if (ob1.equals(obj)) {
			System.out.println("true");					// .equlas to compare val
		} else {
			System.out.println("false");
		}

		if (ob1 == (obj5)) {
			System.out.println("true");					// == to compare the reference
		} else {
			System.out.println("false");
		}

	}

}
