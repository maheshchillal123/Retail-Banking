package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.bean.Account;
import com.util.DatabaseUtil;

public class CreateAccountDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean addAccountDao(Account acc) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String query="INSERT INTO casestudy.account (Customer_id,Account_type,Balance,acc_creation_date,acc_status) VALUES (?,?,?,?,?);";
		ps=con.prepareStatement(query);
		ps.setInt(1, acc.getCust_id());
		ps.setString(2, acc.getAcc_type());
		ps.setInt(3, acc.getCurrent_balance());
		ps.setString(4, timestamp.toString());
		ps.setString(5, "Active");
		
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
	public int getAccountIdDao() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = "SELECT Account_id FROM casestudy.account ORDER BY account_id DESC LIMIT 1;";
		ps = con.prepareStatement(query);

		result = ps.executeQuery();
		if (result.next()) {
			int id = result.getInt("Account_id");
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
			return id;
		} else {

			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(con);
			return -1;
		}
	}

}
