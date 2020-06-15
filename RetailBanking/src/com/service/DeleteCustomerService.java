package com.service;

import java.sql.SQLException;

import com.dao.DeleteCustomerDao;

public class DeleteCustomerService {
	DeleteCustomerDao dao=new DeleteCustomerDao(); 
	public boolean DeleteCustomerDataService(int cust_id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.DeleteCustomerDataDao(cust_id);
	}

}
