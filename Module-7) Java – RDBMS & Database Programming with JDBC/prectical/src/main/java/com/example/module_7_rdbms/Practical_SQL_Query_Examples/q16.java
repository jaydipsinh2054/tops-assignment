package com.example.module_7_rdbms.Practical_SQL_Query_Examples;

//Implement these queries in Java using JDBC.
import java.sql.*;

public class q16 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement();

			// INSERT
			st.executeUpdate("INSERT INTO student VALUES (101,'Rahul',85)");
			System.out.println("Inserted");

			// UPDATE
			st.executeUpdate("UPDATE student SET marks=90 WHERE id=101");
			System.out.println("Updated");

			// SELECT
			ResultSet rs = st.executeQuery("SELECT * FROM student WHERE marks > 80");

			System.out.println("\nSelected Records:");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("marks"));
			}

			// DELETE
			st.executeUpdate("DELETE FROM student WHERE id=101");
			System.out.println("\nDeleted");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
