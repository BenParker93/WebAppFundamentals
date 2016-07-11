package com.ben.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String DBUSER = "BenParker93";
	private static final String DBPASS = "rangers93";
	private static final String DBURL = "jdbc:postgresql://ben-main-database.cgkoae8ss33g.us-west-2.rds.amazonaws.com:5432/benMainDB";
	private static final String DBDRIVER = "org.postgresql.Driver";
	
	public static Connection createConnection(){
		try {
			Class.forName(DBDRIVER);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(
					DBURL, DBUSER,
					DBPASS);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		if (connection != null) {
			return connection;
		} else {
			System.out.println("Failed to make connection");
			return null;
		}
	}
}

