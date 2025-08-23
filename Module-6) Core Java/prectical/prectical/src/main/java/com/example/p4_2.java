package com.example;

// 4.2) Create multiple constructors in a class and demonstrate constructor overloading.
class Student1 {
	String name;
	int age;

	Student1() {
		name = "Unknown";
		age = 0;
		System.out.println("Default Constructor Called");
	}

	Student1(String name) {
		this.name = name;
		this.age = 0;
		System.out.println("Constructor with Name Called: " + name);
	}

	Student1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Constructor with Name & Age Called: " + name + ", " + age);
	}
}

public class p4_2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();

		Student1 s2 = new Student1("Jaydip");

		Student1 s3 = new Student1("Raj", 22);
	}
}
