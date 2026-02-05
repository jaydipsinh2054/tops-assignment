package com.example.module_7_rdbms.Callable_Statement_with_IN_and_OUT_Parameters;

//Demonstrate how to pass IN parameters and retrieve OUT parameters.
import java.sql.*;

public class q22 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			// Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect database
			Connection con = DriverManager.getConnection(url, user, password);

			// Prepare CallableStatement
			CallableStatement cs = con.prepareCall("{call getEmployeeName(?, ?)}");

			// Pass IN parameter
			cs.setInt(1, 1);

			// Register OUT parameter
			cs.registerOutParameter(2, Types.VARCHAR);

			// Execute
			cs.execute();

			// Retrieve OUT parameter
			String fullName = cs.getString(2);

			System.out.println("Employee Name: " + fullName);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
