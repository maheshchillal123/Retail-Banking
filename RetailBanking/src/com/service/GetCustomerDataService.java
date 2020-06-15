package com.service;

import java.sql.SQLException;

import com.bean.Customer;
import com.dao.GetCustomerDataDao;

public class GetCustomerDataService {
	GetCustomerDataDao dao=new GetCustomerDataDao();
	public Customer getUpdateDetailsService(String cust_ssn, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getUpdateDetailsDao(cust_ssn,cust_id);
	}
}
