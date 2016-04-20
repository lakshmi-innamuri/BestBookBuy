/**
 * 
 */
package com.bestbookbuy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author lakshmi
 *
 */
public class DBInterface {

	private Connection connection = null;
	private Statement statement = null;
//	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	String DBInterface1() throws Exception {
		System.out.println("-------- MySQL JDBC Connection Testing ------------");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return "1";
		}
		try {
			String dbConfig[] = Utilities.getDBConfig();
			connection = DriverManager.getConnection(
					"jdbc:mysql://"+dbConfig[0]+":"+dbConfig[1]+"/bestbookbuy", dbConfig[2], dbConfig[3]);
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!!!!!!");
			return "6";
		} else {
			System.out.println("Failed to make connection!");
			return "3";
		}

	}

	public boolean register(String fname, String lname, String email) {

			boolean registered = false;
			PreparedStatement stmt = null;
			try {
				stmt = connection
						.prepareStatement("insert into users(fname,lname,email) values(?,?,?)");
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, email);

				int rows = stmt.executeUpdate();

				if (rows == 1) {
					registered = true;
				} else {
					registered = false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return registered;
		}
	
}
