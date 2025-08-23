package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//16.3) Create a program that reads from one file and writes the content to another file.
public class p16_3 {
	public static void main(String[] args) {
		String inputFile = "input.txt";
		String outputFile = "output.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			System.out.println("Content copied from " + inputFile + " to " + outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
