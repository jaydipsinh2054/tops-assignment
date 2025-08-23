package com.example;

// 2.2) Create a calculator using arithmetic and relational operators.
public class p2_2 {
	public static void main(String[] args) {
		int a = 10, b = 5;

		System.out.println("Arithmetic Operations:");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));

		System.out.println("\nRelational Operations:");
		System.out.println("a > b  : " + (a > b));
		System.out.println("a < b  : " + (a < b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
	}
}
