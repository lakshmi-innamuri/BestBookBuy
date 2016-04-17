/**
 * 
 */
package com.bestbookbuy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lakshmi
 *
 */
public class DBInterface {

	private Connection connection = null;
	private Statement statement = null;
//	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	DBInterface() throws Exception {
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/campus_books", "root", "root");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		} finally {

		}

		if (connection != null) {
			System.out
					.println("You made it, take control your database now!!!!!!");
		} else {
			System.out.println("Failed to make connection!");
		}

	}
}
