package com.example.module_7_rdbms.ResultSet_Metadata;

// Write a program that retrieves and displays column names, types, and count of a
//ResultSet using ResultSetMetaData
import java.sql.*;

public class q13 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM student");

			// Get metadata
			ResultSetMetaData meta = rs.getMetaData();

			int columnCount = meta.getColumnCount();

			System.out.println("Number of Columns: " + columnCount);
			System.out.println("\nColumn Details:");

			for (int i = 1; i <= columnCount; i++) {
				System.out.println("Name: " + meta.getColumnName(i) + " | Type: " + meta.getColumnTypeName(i));
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
