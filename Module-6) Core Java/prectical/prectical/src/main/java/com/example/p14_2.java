package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//14.2) Implement a program that reads a file line by line using BufferedReader. 
public class p14_2 {
	public static void main(String[] args) {
		String fileName = "example.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			System.out.println("Reading file line by line:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
