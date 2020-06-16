package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.dao.AccountStatusTableDao;

public class AccountStatusTableService {
	AccountStatusTableDao dao=new AccountStatusTableDao();
	public ArrayList<Account> getAccountStatusTable() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCustomerStatusTableDao();
	}
}
