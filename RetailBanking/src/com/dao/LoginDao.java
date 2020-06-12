package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DatabaseUtil;

public class LoginDao {
	
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	
	public String validateLoginDao(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = "select * from casestudy.userstore where Email_id='" + email + "' and Password='" + password + "'";
		ps = con.prepareStatement(query);

		result = ps.executeQuery();
		if (result.next()) {
			String emailid = result.getString("Email_id");
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
			return emailid;
		} else {

			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
			return null;
		}
	}

}
