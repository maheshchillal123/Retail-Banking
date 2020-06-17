package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Transfer;
import com.dao.TransferDao;

public class TransferService {
	TransferDao dao=new TransferDao(); 
	public ArrayList transferAmountService(Transfer src, Transfer trg) throws SQLException {
		// TODO Auto-generated method stub
		return dao.transferAmountDao(src,trg);
	}

}
