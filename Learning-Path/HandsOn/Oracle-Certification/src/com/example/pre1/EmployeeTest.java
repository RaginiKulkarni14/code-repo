package com.example.pre1;

class Person {
	String name;

	Person(String n) {
		n = name;
	}
}

class Employee extends Person {
	String empId = "000";

	Employee(String id) {
		super(id);
		id = empId;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee("444");
		Person p=new Person("AA");
		System.out.println(emp.empId);
		System.out.println(p.name);
	}
}
