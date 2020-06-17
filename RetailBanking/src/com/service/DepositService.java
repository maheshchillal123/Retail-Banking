package com.service;

import java.sql.SQLException;

import com.bean.Transfer;
import com.dao.DepositDao;

public class DepositService {
	DepositDao dao=new DepositDao();
	public int depositeMoneyService(Transfer trans) throws SQLException {
		// TODO Auto-generated method stub
		return dao.depositeMoneyDao(trans);
	}

}
