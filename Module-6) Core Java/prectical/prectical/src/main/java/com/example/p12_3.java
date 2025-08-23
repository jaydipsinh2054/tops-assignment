package com.example;

// 12.3) Create a custom exception class and use it in your program.
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class p12_3 {
	static void validate(int age) throws MyException {
		if (age < 18) {
			throw new MyException("Not eligible to vote");
		} else {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(16);
		} catch (MyException e) {
			System.out.println("Caught custom exception: " + e.getMessage());
		}
	}
}
