package com.example;

// 4.1) Create a class Student with attributes (name, age) and a method to display the details.
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class p4_1 {
	public static void main(String[] args) {
		Student s1 = new Student("Jaydip", 23);

		s1.display();
	}
}
