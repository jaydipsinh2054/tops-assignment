package com.example.module_7_rdbms.ResultSet_Interface;

//Write a program that executes a SELECT query and processes the ResultSet to
//display records from the database.
import java.sql.*;

public class q9 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement();

			// Execute SELECT query
			ResultSet rs = st.executeQuery("SELECT * FROM student");

			System.out.println("Student Records:");

			// Process ResultSet
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int marks = rs.getInt("marks");

				System.out.println(id + " " + name + " " + marks);
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
