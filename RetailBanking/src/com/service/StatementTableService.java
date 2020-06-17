package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Transfer;
import com.dao.StatementTableDao;

public class StatementTableService {
	StatementTableDao dao=new StatementTableDao();
	public ArrayList<Transfer> getStatementStatusTable(String acc_id,int no_trans) throws SQLException{
		return dao.getStatementTableDao(acc_id,no_trans);
		
	}
}
