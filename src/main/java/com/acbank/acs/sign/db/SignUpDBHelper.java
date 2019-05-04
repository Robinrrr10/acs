package com.acbank.acs.sign.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acbank.acs.db.DBUtil;

public class SignUpDBHelper {

	public Long getAccountNo(String email, String password) throws ClassNotFoundException, SQLException {
		Long accNo = null;
		String query = "SELECT account_number FROM account_details WHERE email=? AND password=?;";
		PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = DBUtil.fetch(preparedStatement);
		if(resultSet.next()) {
			accNo = resultSet.getLong("account_number");
		}
		return accNo;
	}
	
	public int addNewAccount(String name, String password, String email, long aadhaar) throws SQLException, ClassNotFoundException {
		String query = "INSERT INTO account_details (name, password, email, aadhaar_number) values (?, ?, ?, ?);";
		PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(query);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, email);
		preparedStatement.setLong(4, aadhaar);
		int isAdded = 0;
		isAdded = DBUtil.update(preparedStatement);
		return isAdded;
	}

}
