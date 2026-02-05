package com.example.module_7_rdbms.ResultSet_Metadata;

//Use a SELECT query to display this metadata for a specific table.
import java.sql.*;

public class q14 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			Statement st = con.createStatement();

			// SELECT query for specific table
			ResultSet rs = st.executeQuery("SELECT id, name, marks FROM student");

			ResultSetMetaData meta = rs.getMetaData();

			int count = meta.getColumnCount();

			System.out.println("Metadata for STUDENT table:\n");

			for (int i = 1; i <= count; i++) {
				System.out.println("Column " + i);
				System.out.println("Name  : " + meta.getColumnName(i));
				System.out.println("Type  : " + meta.getColumnTypeName(i));
				System.out.println("Size  : " + meta.getColumnDisplaySize(i));
				System.out.println();
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
