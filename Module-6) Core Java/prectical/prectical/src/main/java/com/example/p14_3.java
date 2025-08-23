package com.example;

import java.io.*;

//14.3) Create a program that demonstrates object serialization and deserialization.

class Student3 implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	int age;

	Student3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class p14_3 {
	public static void main(String[] args) {
		String fileName = "student.ser";
		// Serialize object
		Student3 student = new Student3("Alice", 20);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(student);
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
// Deserialize object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			Student3 deserializedStudent = (Student3) ois.readObject();
			System.out.println("Object deserialized successfully.");
			deserializedStudent.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
