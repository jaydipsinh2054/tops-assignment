package com.example.module_7_rdbms.Database_Metadata;

//Write a program that retrieves and displays metadata information about your
//database using DatabaseMetaData.
import java.sql.*;

public class q11 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			// Get metadata object
			DatabaseMetaData meta = con.getMetaData();

			// Display basic info
			System.out.println("Database Product Name  : " + meta.getDatabaseProductName());
			System.out.println("Database Version       : " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name            : " + meta.getDriverName());
			System.out.println("Driver Version         : " + meta.getDriverVersion());

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
