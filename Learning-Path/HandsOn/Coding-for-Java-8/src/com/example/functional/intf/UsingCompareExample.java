package com.example.functional.intf;

import java.util.*;

public class UsingCompareExample {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("Merry", 20000));
		employee.add(new Employee("Hena", 30000));
		employee.add(new Employee("Zoya", 28000));
		employee.add(new Employee("Lara", 15000));
		employee.add(new Employee("Albert", 60000));

		//Anonymous class 
		Collections.sort(employee, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() - e2.getSalary();
			}
		});
		System.out.println(employee);
		
		//using lambda 
		Collections.sort(employee,(e1,e2) ->  e1.getSalary() - e2.getSalary()); //on salary
		System.out.println(employee);
		
		Collections.sort(employee, (e1,e2) -> e1.getName().compareTo(e2.getName())); //on names
		System.out.println(employee);
	}
}

//Traditional way
/*class TestComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary() - e2.getSalary();
	}
	
}*/
