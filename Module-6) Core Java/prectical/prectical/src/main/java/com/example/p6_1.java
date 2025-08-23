package com.example;

// 6.1) Write a program demonstrating single inheritance. 
class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

public class p6_1 {
	public static void main(String[] args) {
		Dog d = new Dog();

		d.eat();
		d.bark();
	}
}
