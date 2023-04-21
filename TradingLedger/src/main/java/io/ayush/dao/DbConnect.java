package io.ayush.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

	private static final String URL = "jdbc:mysql://localhost:3306/trading_ledger";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
