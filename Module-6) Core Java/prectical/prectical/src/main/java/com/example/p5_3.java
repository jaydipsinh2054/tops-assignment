package com.example;

// 5.3) Create a class with static variables and methods to demonstrate their use.
class Example {
	static int count = 0;

	static void increment() {
		count++;
	}

	static void display() {
		System.out.println("Count = " + count);
	}
}

public class p5_3 {
	public static void main(String[] args) {
		Example.increment();
		Example.increment();
		Example.display();

		Example e1 = new Example();
		Example e2 = new Example();

		e1.increment();
		e2.increment();

		Example.display();
	}
}
