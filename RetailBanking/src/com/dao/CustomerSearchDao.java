package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class CustomerSearchDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Customer> getCustomerDetailsDao(String ssn, String id) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		if(ssn!="") {
			query = "select customer.ssn,customer.customer_id,customer.name,customer.address,customer.Age,customer.status from casestudy.customer where SSN="+Integer.parseInt(ssn);
		}
		else {
			query = "select customer.ssn,customer.customer_id,customer.name,customer.address,customer.Age,customer.status from casestudy.customer where Customer_id="+Integer.parseInt(id);
		}
		ps = con.prepareStatement(query);
		ArrayList<Customer> lst=new ArrayList<Customer>();
		result=ps.executeQuery();
		while(result.next()) {
			Customer cust=new Customer();
			cust.setCust_ssn(result.getInt("SSN"));
			cust.setCust_id(result.getInt("Customer_id"));
			cust.setCust_name(result.getString("Name"));
			cust.setCust_address(result.getString("Address"));
			cust.setCust_age(result.getInt("Age"));
			cust.setStatus(result.getString("status"));
			lst.add(cust);
			
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return lst;
	}

}
