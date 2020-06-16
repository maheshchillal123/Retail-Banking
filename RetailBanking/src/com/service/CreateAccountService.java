package com.service;

import java.sql.SQLException;

import com.bean.Account;
import com.dao.CreateAccountDao;

public class CreateAccountService {
	CreateAccountDao dao=new CreateAccountDao();
	public boolean addAccountService(Account acc) throws SQLException {
		// TODO Auto-generated method stub
		return dao.addAccountDao(acc);
	}
	public int getAccountIdservice() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAccountIdDao();
	}

}
