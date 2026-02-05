package com.example.module_7_rdbms.JDBC_Driver_Types;

import java.sql.*;

//Identify which driver your Java program uses to connect to MySQL.

public class q3 {
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

//The Java program uses the MySQL Connector/J JDBC Driver. 
//This driver allows Java applications to communicate directly with the MySQL database without requiring any native libraries. 
//It converts JDBC calls into MySQL network protocol.
