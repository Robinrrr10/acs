package com.acbank.acs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	//static String mySqlDriverClass = "com.mysql.jdbc.Driver";
	//static String mysqlUrl = "jdbc:mysql://192.168.40.124:3306/acs";
	//static String mysqlUser = "root";
	//static String mysqlPassword = "root";
	
	static String mySqlDriverClass = "com.mysql.jdbc.Driver";
	static String mysqlUrl = System.getProperty("JDBC_URL");
	static String mysqlUser = System.getProperty("JDBC_USER");
	static String mysqlPassword = System.getProperty("JDBC_PASSWORD");

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
