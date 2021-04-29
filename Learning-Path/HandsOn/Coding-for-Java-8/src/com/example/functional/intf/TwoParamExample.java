package com.example.functional.intf;

interface Addition {
	int add(int a, int b);
}

public class TwoParamExample {

	public static void main(String[] args) {

		// anonymous class
	/*	Addition addition = new Addition() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		addition.add(10, 20); */
		
		//using lambda without return
		Addition addition = (a,b) -> (a+b);
		System.out.println(addition.add(10, 20));
		
		//using lambda without return
		Addition addition2 = (a,b) -> {
			//if there are multiple statements, go for return
			System.out.println(a);
			System.out.println(b);
			return (a+b);
		};
		System.out.println(addition2.add(10, 20));
	}

}
