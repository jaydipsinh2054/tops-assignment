package com.example;

import java.util.HashMap;

//15.3) Create a HashMap to store and retrieve key-value pairs.
public class p15_3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println("HashMap: " + map);

		System.out.println("Value for key 2: " + map.get(2));

		System.out.println("All key-value pairs:");
		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

	}
}
