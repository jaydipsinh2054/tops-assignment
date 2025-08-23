package com.example.pack1;

public class SamePackage {
	public static void main(String[] args) {
		AccessDemo obj = new AccessDemo();
		obj.show();
		System.out.println(obj.publicVar);
		System.out.println(obj.protectedVar);
		System.out.println(obj.defaultVar);
		// System.out.println(obj.privateVar); // ❌ Not accessible
	}
}
