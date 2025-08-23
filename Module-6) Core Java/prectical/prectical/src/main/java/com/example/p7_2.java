package com.example;

// 7.2) Demonstrate constructor overloading by passing different types of parameters.
class Person1 {
	String name;
	int age;

	Person1() {
		name = "Unknown";
		age = 0;
	}

	Person1(String name) {
		this.name = name;
		this.age = 0;
	}

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class p7_2 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Person1 p2 = new Person1("Jaydip");
		Person1 p3 = new Person1("Raj", 25);

		p1.display();
		p2.display();
		p3.display();
	}
}
