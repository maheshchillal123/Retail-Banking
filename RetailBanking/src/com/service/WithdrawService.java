package com.service;

import java.sql.SQLException;

import com.bean.Transfer;
import com.dao.WithdrawDao;

public class WithdrawService {
	WithdrawDao dao=new WithdrawDao();
	public int withdrawMoneyService(Transfer trans) throws SQLException {
		// TODO Auto-generated method stub
		return dao.withdrawMoneyDao(trans);
	}

}
