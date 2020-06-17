package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.dao.AccountSearchDao;

public class AccountSearchService {
	AccountSearchDao dao=new AccountSearchDao();
	public ArrayList<Account> getAccountDetailsService(String acc_id, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAccountDetailsDao(acc_id,cust_id);
	}

}
