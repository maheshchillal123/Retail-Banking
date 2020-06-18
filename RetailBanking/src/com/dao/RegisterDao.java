package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.util.DatabaseUtil;

public class RegisterDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean registerExecutiveDao(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String query="INSERT INTO casestudy.userstore(Email_id,Password,Timestamp)VALUES(?,?,?)";
		ps=con.prepareStatement(query);
		ps.setString(1, email);
		ps.setString(2, pass);
		ps.setString(3, timestamp.toString());
		
		int result = ps.executeUpdate();
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		if(result>0) {
			return true;
		}
		else {
			return false;
		}
	}

}
