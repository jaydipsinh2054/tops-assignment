package com.example.module_7_rdbms.Types_of_JDBC_Statements;

import java.sql.*;
//Create a program that inserts, updates, selects, and deletes data using Statement.

public class q6 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);

			// INSERT
			PreparedStatement psInsert = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
			psInsert.setInt(1, 2);
			psInsert.setString(2, "Alice");
			psInsert.setInt(3, 95);
			psInsert.executeUpdate();

			// UPDATE
			PreparedStatement psUpdate = con.prepareStatement("UPDATE student SET marks=? WHERE id=?");
			psUpdate.setInt(1, 98);
			psUpdate.setInt(2, 2);
			psUpdate.executeUpdate();

			// SELECT
			PreparedStatement psSelect = con.prepareStatement("SELECT * FROM student");
			ResultSet rs = psSelect.executeQuery();

			System.out.println("Student Records:");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("marks"));
			}

			// DELETE
			PreparedStatement psDelete = con.prepareStatement("DELETE FROM student WHERE id=?");
			psDelete.setInt(1, 2);
			psDelete.executeUpdate();

			con.close();
			System.out.println("CRUD operations using PreparedStatement completed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
