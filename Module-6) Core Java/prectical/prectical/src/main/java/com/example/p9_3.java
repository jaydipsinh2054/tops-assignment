package com.example;

// 9.3) Use the super keyword to call the parent class constructor and methods.
public class p9_3 {

	class Parent {
		Parent() {
			System.out.println("Parent constructor");
		}

		void greet() {
			System.out.println("Hello from Parent");
		}
	}

	class Child extends Parent {
		Child() {
			super();
			System.out.println("Child constructor");
		}

		@Override
		void greet() {
			super.greet();
			System.out.println("Hello from Child");
		}
	}

	public static void main(String[] args) {
		p9_3 outer = new p9_3();
		Child obj = outer.new Child();
		obj.greet();
	}
}
