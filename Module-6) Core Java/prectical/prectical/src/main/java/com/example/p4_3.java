package com.example;

// 4.3) Implement a simple class with getters and setters for encapsulation.
class Student2 {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class p4_3 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();

		s1.setName("Jaydip");
		s1.setAge(23);

		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
	}
}
