package com.example;

// 12.2) Implement multiple catch blocks for different types of exceptions.
public class p12_2 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());

			int arr[] = new int[5];
			arr[10] = 50;
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
		} catch (Exception e) {
			System.out.println("Caught General Exception: " + e);
		}
	}
}
