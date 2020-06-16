package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.util.DatabaseUtil;

public class UpdateAccountStatusMessageDao {
	static Connection con = null;
	static PreparedStatement ps = null;
	boolean flag = false;
	public static boolean UpdateAccountStatus(int account_id, String msg) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query = null;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if(account_id!=0) {
			query = "insert into casestudy.account_status values("+account_id+",'"+msg+"','"+timestamp+"')";
		}
		ps=con.prepareStatement(query);
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
