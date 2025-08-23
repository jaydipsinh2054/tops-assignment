package com.example;

import java.util.ArrayList;
import java.util.HashSet;

//15.2) Implement a program using HashSet to remove duplicate elements from a list.
public class p15_2 {
	public static void main(String[] args) {
		ArrayList<String> listWithDuplicates = new ArrayList<>();
		listWithDuplicates.add("Apple");
		listWithDuplicates.add("Banana");
		listWithDuplicates.add("Apple");
		listWithDuplicates.add("Cherry");
		listWithDuplicates.add("Banana");
		System.out.println("Original List: " + listWithDuplicates);

		HashSet<String> uniqueSet = new HashSet<>(listWithDuplicates);
		ArrayList<String> listWithoutDuplicates = new ArrayList<>(uniqueSet);
		System.out.println("List after removing duplicates: " + listWithoutDuplicates);

	}
}
