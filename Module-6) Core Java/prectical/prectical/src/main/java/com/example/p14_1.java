package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//14.1) Write a program to read and write content to a file using FileReader and FileWriter. 
public class p14_1 {
	public static void main(String[] args) {
		String fileName = "example.txt";
		try {
			// Writing to the file
			FileWriter writer = new FileWriter(fileName);
			writer.write("Hello, this is a test file.\nWelcome to FileReader and FileWriter example.");
			writer.close();
			System.out.println("File written successfully.");
			// Reading from the file
			FileReader reader = new FileReader(fileName);
			int character;
			System.out.println("Reading file content:");
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
