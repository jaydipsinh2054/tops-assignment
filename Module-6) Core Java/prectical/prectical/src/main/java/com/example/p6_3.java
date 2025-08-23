package com.example;

// 6.3) Implement method overriding to show polymorphism in action.

class Parent {
	void message() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	@Override
	void message() {
		System.out.println("Child");
	}
}

public class p6_3 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();

		p1.message();
		p2.message();
	}
}
