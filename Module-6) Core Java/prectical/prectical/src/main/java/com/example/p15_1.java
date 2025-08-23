package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

//15.1) Write a program that demonstrates the use of an ArrayList and LinkedList. 
public class p15_1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		System.out.println("ArrayList: " + arrayList);

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Elephant");
		linkedList.add("Fox");
		System.out.println("LinkedList: " + linkedList);

		System.out.println("First element in ArrayList: " + arrayList.get(0));
		System.out.println("First element in LinkedList: " + linkedList.get(0));
	}

}
