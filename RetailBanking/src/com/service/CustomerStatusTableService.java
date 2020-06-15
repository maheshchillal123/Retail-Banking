package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.dao.CustomerStatusTableDao;

public class CustomerStatusTableService {
	CustomerStatusTableDao dao=new CustomerStatusTableDao();
	public ArrayList<Customer> getCustomerStatusTable() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCustomerStatusTableDao();
	}
}
