package com.example.module_7_rdbms.JDBC_CRUD_Operations;

import java.sql.*;
//Write a Java program that performs the following CRUD operations:
//Insert a new record.
//Update an existing record.
//Select and display records.
//Delete a record from the database.

public class q8 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish Connection
			Connection con = DriverManager.getConnection(url, user, password);

			// Use PreparedStatement (recommended)

			// 1️⃣ INSERT
			PreparedStatement insert = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
			insert.setInt(1, 101);
			insert.setString(2, "Rahul");
			insert.setInt(3, 88);
			insert.executeUpdate();
			System.out.println("Record Inserted");

			// 2️⃣ UPDATE
			PreparedStatement update = con.prepareStatement("UPDATE student SET marks=? WHERE id=?");
			update.setInt(1, 92);
			update.setInt(2, 101);
			update.executeUpdate();
			System.out.println("Record Updated");

			// 3️⃣ SELECT
			PreparedStatement select = con.prepareStatement("SELECT * FROM student");
			ResultSet rs = select.executeQuery();

			System.out.println("\nStudent Records:");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("marks"));
			}

			// 4️⃣ DELETE
			PreparedStatement delete = con.prepareStatement("DELETE FROM student WHERE id=?");
			delete.setInt(1, 101);
			delete.executeUpdate();
			System.out.println("\nRecord Deleted");

			// Close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
