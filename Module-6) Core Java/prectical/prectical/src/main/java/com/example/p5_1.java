package com.example;

// 5.1) Write a program to find the maximum of three numbers using a method. 
public class p5_1 {

	static int max(int a, int b, int c) {
		return (a > b && a > c) ? a : (b > c ? b : c);
	}

	public static void main(String[] args) {
		int x = 10, y = 25, z = 15;

		int maximum = max(x, y, z);

		System.out.println("The maximum of " + x + ", " + y + ", and " + z + " is: " + maximum);
	}
}
