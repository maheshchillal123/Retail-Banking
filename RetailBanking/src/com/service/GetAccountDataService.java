package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.dao.GetAccountDataDao;

public class GetAccountDataService {
	GetAccountDataDao dao=new GetAccountDataDao();
	public ArrayList<Account> getAccountDetailsService(String ssn, String id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAccountDetailsDao(ssn,id);
	}

}
