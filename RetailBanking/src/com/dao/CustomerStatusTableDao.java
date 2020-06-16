package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.util.DatabaseUtil;

public class CustomerStatusTableDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Customer> getCustomerStatusTableDao() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query="select cust.SSN,cust.Customer_id,cust.status,newtable.Message,newtable.lastupdate from casestudy.customer as cust inner join" + 
				" (select main.customer_id, main.message, main.lastupdate" + 
				" from casestudy.customer_status main" + 
				" inner join (select Customer_id, max(lastupdate) as lastupdate FROM casestudy.customer_status group by customer_id) sec" + 
				" on main.customer_id = sec.customer_id and main.lastupdate = sec.lastupdate) as newtable on cust.Customer_id=newtable.customer_id";
		ps = con.prepareStatement(query);
		result = ps.executeQuery();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		while (result.next()) {
			Customer cust = new Customer();
			cust.setCust_ssn(result.getInt("SSN"));
			cust.setCust_id(result.getInt("Customer_id"));
			cust.setStatus(result.getString("status"));
			cust.setMsg(result.getString("message"));
			cust.setLast_update(result.getString("lastupdate"));

			customerList.add(cust);
//			System.out.println(eventList.toString());
		}

		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);

//		for (Event a : eventList) {
//			System.out.println("service" + a.getEvent_id());
//		}

		return customerList;
	}

}
