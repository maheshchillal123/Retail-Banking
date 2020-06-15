package com.service;

import java.sql.SQLException;

import com.bean.Customer;
import com.dao.UpdateCustomerDao;

public class UpdateCustomerService {
	UpdateCustomerDao dao=new UpdateCustomerDao();
	public boolean UpdateCustomerDataService(Customer cust) throws SQLException {
		// TODO Auto-generated method stub
		return dao.UpdateCustomerDataDao(cust);
	}

}
