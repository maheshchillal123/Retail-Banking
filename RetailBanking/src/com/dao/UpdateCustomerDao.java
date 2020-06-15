package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class UpdateCustomerDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean UpdateCustomerDataDao(Customer cust) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query = "UPDATE casestudy.customer SET Name = '"+cust.getCust_name()+"', Address = '"+cust.getCust_address()+"', Age = "+cust.getCust_age()+" WHERE Customer_id ="+cust.getCust_id();
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
