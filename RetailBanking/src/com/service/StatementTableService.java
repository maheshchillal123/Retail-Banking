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
	public ArrayList<Transfer>getStatementStatusTableByDate(String acc_id,String start,String end) throws SQLException{
		return dao.getStatementTableByDate(acc_id,start,end);
	}
}
