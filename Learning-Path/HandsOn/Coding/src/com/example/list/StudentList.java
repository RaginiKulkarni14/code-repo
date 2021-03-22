package com.example.list;

import java.util.*;

public class StudentList {

	public static void main(String[] args) {

		// one way of adding values

		List<Student> al = new ArrayList<>();
		al.add(new Student(99, "h", 10));
		al.add(new Student(89, "i", 11));
		al.add(new Student(79, "g", 12));
		al.add(new Student(89, "j", 11));
		al.add(new Student(89, "i", 16));
		al.add(new Student(89, "i", 11));

		// another way

		List<Student> st = new ArrayList<>(); // list created
		st.add(new Student(99, "h", 10));
		st.add(new Student(89, "i", 11));
		st.add(new Student(79, "g", 12));

		Student st1 = new Student();
		st1.marks = 50;
		st1.setName("k");
		st1.setRn(1);
		st.add(st1); // adding values to the list
		
System.out.println("------------------------------------------------------------------------------------------------------------");
		
		//sort using collections and lambda expression
		
		// on names
		Collections.sort(st, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		for (Student s : st) {
			System.out.println("["+s.getName()+","+s.getRn()+","+s.marks+"]");
		}

		// on marks
		Collections.sort(st, (m1, m2) -> (m1.marks > m2.marks) ? 1 : (m1.marks < m2.marks) ? -1 : 0);
		System.out.println("marks : "+st);

		// descending marks
		Collections.sort(st, (m1, m2) -> (m1.marks < m2.marks) ? 1 : (m1.marks > m2.marks) ? -1 : 0); // sort in descending order(largest to small)
		System.out.println("descending marks : "+st);
		
		System.out.println("second highest" + st.get(1)); // bring 2nd index to get second highest marks
		
		//get marks less than 90 using stream
		st.stream().filter(p -> p.marks < 90).map(pm -> pm.marks).forEach(System.out::println);
		
		//get marks less than 90 using stream without map
		st.stream() .filter(p->p.marks<90) .forEach(System.out::println);
		
System.out.println("------------------------------------------------------------------------------------------------------------");
		
		// iterating list with for loop
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i).getName());
		}

		// iterating list with iterator
		Iterator it = st.iterator();
		while (it.hasNext()) {
			Student stp = (Student) it.next();
			System.out.println("iterator print:" + stp.getName() + ":" + stp.getRn());
		}

		// iterating list with for-each
		for (Student s : st) {
			System.out.println(s.getName());
		}

		
	}

}
