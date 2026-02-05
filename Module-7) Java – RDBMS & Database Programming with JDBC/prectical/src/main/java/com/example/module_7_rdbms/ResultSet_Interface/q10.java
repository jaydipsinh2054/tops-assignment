package com.example.module_7_rdbms.ResultSet_Interface;

//Demonstrate how to navigate through the ResultSet using methods like next(),
//previous(),etc.
import java.sql.*;

public class q10 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			// Scrollable ResultSet
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = st.executeQuery("SELECT * FROM student");

			// first()
			rs.first();
			System.out.println("First: " + rs.getString("name"));

			// last()
			rs.last();
			System.out.println("Last: " + rs.getString("name"));

			// previous()
			rs.previous();
			System.out.println("Previous: " + rs.getString("name"));

			// next()
			rs.next();
			System.out.println("Next: " + rs.getString("name"));

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
