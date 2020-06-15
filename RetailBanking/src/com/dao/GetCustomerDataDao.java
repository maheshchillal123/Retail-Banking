package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class GetCustomerDataDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	
	public Customer getUpdateDetailsDao(String cust_ssn, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		if(cust_ssn!="") {
			query = "select * from casestudy.customer where SSN="+Integer.parseInt(cust_ssn);
		}
		else {
			query = "select * from casestudy.customer where Customer_id="+Integer.parseInt(cust_id);
		}
		ps = con.prepareStatement(query);
//		ArrayList<Customer> lst=new ArrayList<Customer>();
		result=ps.executeQuery();
		Customer c=new Customer();
		if(result.next()) {
			c.setCust_ssn(result.getInt("SSN"));
			c.setCust_id(result.getInt("Customer_id"));
			c.setCust_name(result.getString("Name"));
			c.setCust_address(result.getString("Address"));
			c.setCust_age(result.getInt("Age"));
//			lst.add(c);
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return c;
	}
}
