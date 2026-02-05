package com.example.module_7_rdbms.Callable_Statement_with_IN_and_OUT_Parameters;

//Write a Java program that uses CallableStatement to call this stored procedure.
import java.sql.*;

public class q21 {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			// Call procedure
			CallableStatement cs = con.prepareCall("{call getEmployeeName(?, ?)}");

			cs.setInt(1, 1); // employee id
			cs.registerOutParameter(2, Types.VARCHAR);

			cs.execute();

			String name = cs.getString(2);
			System.out.println("Employee Name: " + name);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
