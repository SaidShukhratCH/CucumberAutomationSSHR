package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Register driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.Open the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcamp", "root", "94130Shuh990500");

		// 3. Query the database
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select first_name from employees;");

		// 4. Print the result into console
		while (result.next()) {
			// System.out.println(result.getString("first_name"));
			System.out.print(result.getString("first_name")+" ");

		}

	}

}
