package com.training.java;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee joe = new Employee("Joe", 30);
		Employee mike = new Employee("Mike", 35);
		
		joe.greet();
		joe.work();
		
		mike.greet();
		mike.work();
	}
}
