package com.example;

// 12.1) Write a program to demonstrate exception handling using try-catch-finally.
public class p12_1 {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Caught an exception: " + e);
		} finally {
			System.out.println("Finally block always executes.");
		}
	}
}
