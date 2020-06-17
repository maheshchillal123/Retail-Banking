package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.dao.CustomerSearchDao;

public class CustomerSearchService {
	CustomerSearchDao dao=new CustomerSearchDao();
	public ArrayList<Customer> getCustomerDetailsService(String ssn, String id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCustomerDetailsDao(ssn,id);
	}

}
