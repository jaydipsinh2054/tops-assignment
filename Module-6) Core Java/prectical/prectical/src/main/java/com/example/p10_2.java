package com.example;

// 10.2) Write a program that implements multiple interfaces in a single class.
public class p10_2 {

	interface Printable {
		void print();
	}

	interface Showable {
		void show();
	}

	class Demo implements Printable, Showable {
		public void print() {
			System.out.println("Printing...");
		}

		public void show() {
			System.out.println("Showing...");
		}
	}

	public static void main(String[] args) {
		p10_2 outer = new p10_2();
		Demo d = outer.new Demo();
		d.print();
		d.show();
	}
}
