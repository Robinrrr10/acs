package com.acbank.acs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	static String mySqlDriverClass = "com.mysql.jdbc.Driver";
	static String mysqlUrl = "jdbc:mysql://localhost:3306/myrestproject";
	static String mysqlUser = "root";
	static String mysqlPassword = "root";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(mySqlDriverClass);
		Connection connection = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPassword);
		return connection;
	}
	
	public static int update(PreparedStatement preparedStatement) throws SQLException {
		int result = 0;
		result = preparedStatement.executeUpdate();
		return result;
	}
	
	public static ResultSet fetch(PreparedStatement preparedStatement) throws SQLException {
		ResultSet result = preparedStatement.executeQuery();
		return result;
	}
	
}
