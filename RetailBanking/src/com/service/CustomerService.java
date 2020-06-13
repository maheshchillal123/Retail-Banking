package com.service;

import java.sql.SQLException;

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

}
