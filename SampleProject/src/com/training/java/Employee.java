package com.training.java;

public class Employee {

	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void greet() {
		System.out.println("Good morning, This is " + name);
	}
	
	public void work() {
		System.out.println(name + " is working");
	}
}
