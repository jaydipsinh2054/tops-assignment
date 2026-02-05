package com.example.module_7_rdbms.Steps_for_Creating_JDBC_Connections;

import java.sql.*;
//Write a Java program to establish a connection to a database and print a
//confirmation message upon successful connection

public class q5 {
	public static void main(String[] args) {

		// Database details
		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "root";

		try {
			// Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection con = DriverManager.getConnection(url, username, password);

			// Confirmation message
			System.out.println("Connection established successfully!");

			// Close connection
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!");

		} catch (SQLException e) {
			System.out.println("Database connection failed!");
		}
	}
}
