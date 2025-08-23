package com.example;

// 10.1) Create an abstract class and implement its methods in a subclass.
public class p10_1 {

	abstract class Shape {
		abstract void draw();

		void display() {
			System.out.println("This is a shape.");
		}
	}

	class Circle extends Shape {
		@Override
		void draw() {
			System.out.println("Drawing a circle.");
		}
	}

	public static void main(String[] args) {
		p10_1 outer = new p10_1();
		Circle c = outer.new Circle();
		c.display();
		c.draw();
	}
}
