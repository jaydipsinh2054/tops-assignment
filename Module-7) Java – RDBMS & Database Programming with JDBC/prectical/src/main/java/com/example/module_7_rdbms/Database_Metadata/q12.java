package com.example.module_7_rdbms.Database_Metadata;

//Display database name, version, list of tables, and supported SQL features.
import java.sql.*;

public class q12 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			DatabaseMetaData meta = con.getMetaData();

			// Database name & version
			System.out.println("Database: " + meta.getDatabaseProductName());
			System.out.println("Version : " + meta.getDatabaseProductVersion());

			// List of tables
			System.out.println("\nTables in database:");
			ResultSet tables = meta.getTables(null, null, "%", new String[] { "TABLE" });

			while (tables.next()) {
				System.out.println(tables.getString("TABLE_NAME"));
			}

			// Supported features
			System.out.println("\nSupported SQL Features:");
			System.out.println("Supports Transactions : " + meta.supportsTransactions());
			System.out.println("Supports Joins        : " + meta.supportsOuterJoins());
			System.out.println("Supports Stored Proc  : " + meta.supportsStoredProcedures());
			System.out.println("Supports Batch Update : " + meta.supportsBatchUpdates());

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
