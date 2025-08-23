package com.example;

// 8.3) Implement string comparison using equals() and compareTo() methods.
public class p8_3 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "Hello";

		System.out.println("s1 equals s2? " + s1.equals(s2));
		System.out.println("s1 equals s3? " + s1.equals(s3));

		System.out.println("s1 compareTo s2: " + s1.compareTo(s2));
		System.out.println("s1 compareTo s3: " + s1.compareTo(s3));
		System.out.println("s2 compareTo s1: " + s2.compareTo(s1));
	}
}
