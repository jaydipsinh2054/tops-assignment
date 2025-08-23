package com.example;

// 7.1) Write a program to create and initialize an object using a parameterized constructor. 
class Person {
	String name;

	Person(String n) {
		name = n;
	}

	void display() {
		System.out.println("Name: " + name);
	}
}

public class p7_1 {
	public static void main(String[] args) {
		Person p1 = new Person("Jaydip");
		p1.display();
	}
}
