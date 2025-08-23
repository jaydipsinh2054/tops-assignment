package com.example;

// 2.1) Write a program to demonstrate the use of different data types.
public class p2_1 {

	public static void main(String[] args) {
		byte b = 100;
		short s = 32000;
		int age = 30;
		long population = 7800000000L;
		float salary = 45678.90f;
		double pi = 3.141592653589793;
		char grade = 'A';
		boolean passed = true;

		String name = "Alice";
		int[] marks = { 90, 85, 88 };

		// Printing values
		System.out.println("byte b: " + b);
		System.out.println("short s: " + s);
		System.out.println("int age: " + age);
		System.out.println("long population: " + population);
		System.out.println("float salary: " + salary);
		System.out.println("double pi: " + pi);
		System.out.println("char grade: " + grade);
		System.out.println("boolean passed: " + passed);
		System.out.println("String name: " + name);

		System.out.print("Array marks: ");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
	}
}
