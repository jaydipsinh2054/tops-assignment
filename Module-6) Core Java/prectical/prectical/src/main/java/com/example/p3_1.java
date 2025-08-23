package com.example;

import java.util.Scanner;

// 3.1) Write a program to find if a number is even or odd using an if-else statement.
public class p3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}

		sc.close();
	}
}
