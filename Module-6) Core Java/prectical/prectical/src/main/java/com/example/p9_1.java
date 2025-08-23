package com.example;

// 9.1) Write a program that demonstrates inheritance using extends keyword.
public class p9_1 {

	class Parent {
		void display() {
			System.out.println("This is the Parent class.");
		}
	}

	class Child extends Parent {
		void show() {
			System.out.println("This is the Child class.");
		}
	}

	public static void main(String[] args) {
		p9_1 outer = new p9_1();
		Child obj = outer.new Child();

		obj.display();
		obj.show();
	}
}
