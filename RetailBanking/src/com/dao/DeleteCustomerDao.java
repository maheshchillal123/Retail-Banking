package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DatabaseUtil;

public class DeleteCustomerDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean DeleteCustomerDataDao(int cust_id) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query = "UPDATE casestudy.customer SET status = 'InActive' WHERE Customer_id ="+cust_id;
		ps = con.prepareStatement(query);

		int result = ps.executeUpdate();
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

}
