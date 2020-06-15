package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class GetCustomerStatusDao {
	static Connection con = null;
	static PreparedStatement ps = null;
	boolean flag = false;
	public static String getCustomerStatus(String cust_ssn, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		if(cust_ssn!="") {
			query = "select status from casestudy.customer where SSN="+Integer.parseInt(cust_ssn);
		}
		else {
			query = "select status from casestudy.customer where Customer_id="+Integer.parseInt(cust_id);
		}
		ps = con.prepareStatement(query);
//		ArrayList<Customer> lst=new ArrayList<Customer>();
		result=ps.executeQuery();
		String status="";
		if(result.next()) {
			status=result.getString("status");
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return status;
	}
}
