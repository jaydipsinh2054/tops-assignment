package com.example.module_7_rdbms.Introduction_to_JDBC;

import java.sql.*;

//Demonstrate the process of loading a JDBC driver and establishing a connection.

public class q2 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			// Establish Connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established");

			// Close Connection
			con.close();
			System.out.println("Connection Closed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
