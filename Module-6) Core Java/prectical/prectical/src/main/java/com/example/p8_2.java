package com.example;

import java.util.Scanner;

// 8.2) Create a program to reverse a string and check for palindromes.
public class p8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String rev = new StringBuilder(str).reverse().toString();

		System.out.println("Reversed: " + rev);

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		sc.close();
	}
}
