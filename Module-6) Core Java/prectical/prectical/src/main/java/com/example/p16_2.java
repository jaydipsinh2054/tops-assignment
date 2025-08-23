package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//16.2) Implement a file copy program using FileInputStream and FileOutputStream. 
public class p16_2 {
	public static void main(String[] args) {
		String sourceFile = "source.txt";
		String destFile = "destination.txt";
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)) {
			int byteContent;
			while ((byteContent = fis.read()) != -1) {
				fos.write(byteContent);
			}
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
