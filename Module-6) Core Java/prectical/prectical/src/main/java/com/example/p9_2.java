package com.example;

// 9.2) Implement runtime polymorphism by overriding methods in the child class.
public class p9_2 {

	class Animal {
		void sound() {
			System.out.println("Animal makes a sound");
		}
	}

	class Dog extends Animal {
		@Override
		void sound() {
			System.out.println("Dog barks");
		}
	}

	public static void main(String[] args) {
		p9_2 outer = new p9_2();
		Animal obj = outer.new Dog();
		obj.sound();
	}
}
