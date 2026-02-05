package com.example.module_7_rdbms.Swing_GUI_for_CRUD_Operations;

//Implement CRUD operations (Insert, Update, Select, Delete) using JDBC and MySQL.
import java.sql.*;

public class q18 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement ps;

			// INSERT
			ps = con.prepareStatement("INSERT INTO users VALUES (1,'John','Smith','john@gmail.com')");
			ps.executeUpdate();

			// UPDATE
			ps = con.prepareStatement("UPDATE users SET fname='Johnny' WHERE id=1");
			ps.executeUpdate();

			// SELECT
			ps = con.prepareStatement("SELECT * FROM users");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}

			// DELETE
			ps = con.prepareStatement("DELETE FROM users WHERE id=1");
			ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
