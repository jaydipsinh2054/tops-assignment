package com.example.module_7_rdbms.Introduction_to_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Write a simple Java program to connect to a MySQL database using JDBC.

public class q1 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Database Connected Successfully!");
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
