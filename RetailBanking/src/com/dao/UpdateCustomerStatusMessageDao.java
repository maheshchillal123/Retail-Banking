package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.util.DatabaseUtil;

public class UpdateCustomerStatusMessageDao {
	static Connection con = null;
	static PreparedStatement ps = null;
	boolean flag = false;
	public static boolean UpdateCustomerStatus(int cust_ssn, int cust_id, String msg) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query = null;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if(cust_ssn!=0) {
			query = "insert into casestudy.customer_status values((select Customer_id from customer where SSN="+cust_ssn+"),'"+msg+"','"+timestamp+"')";
		}
		else {
			query = "insert into casestudy.customer_status values("+cust_id+",'"+msg+"','"+timestamp+"')";
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
