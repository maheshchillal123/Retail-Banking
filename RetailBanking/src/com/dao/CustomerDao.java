package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class CustomerDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean createCustomerDao(Customer cust) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query="INSERT INTO casestudy.customer(SSN,Name,Address,Age,State,City,status)VALUES(?,?,?,?,?,?,?)";
		ps=con.prepareStatement(query);
		ps.setInt(1, cust.getCust_ssn());
		ps.setString(2, cust.getCust_name());
		ps.setString(3, cust.getCust_address());
		ps.setInt(4, cust.getCust_age());
		ps.setString(5, cust.getCust_state());
		ps.setString(6, cust.getCust_city());
		ps.setString(7, "Active");
		
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
	public int getCustomerIdDao() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = "SELECT Customer_id FROM casestudy.customer ORDER BY customer_id DESC LIMIT 1;";
		ps = con.prepareStatement(query);

		result = ps.executeQuery();
		if (result.next()) {
			int id = result.getInt("Customer_id");
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
