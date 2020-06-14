package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.dao.CustomerDao;

public class CustomerService {
	CustomerDao dao=new CustomerDao();
	public boolean createCustomerService(Customer cust) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomerDao(cust);
	}
	public int getCustomerIdservice() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCustomerIdDao();
	}
	public Customer getUpdateDetailsService(String cust_ssn, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getUpdateDetailsDao(cust_ssn,cust_id);
	}

}
