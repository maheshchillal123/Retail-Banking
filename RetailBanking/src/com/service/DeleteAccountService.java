package com.service;

import java.sql.SQLException;

import com.dao.DeleteAccountDao;

public class DeleteAccountService {
	DeleteAccountDao dao=new DeleteAccountDao(); 
	public boolean DeleteAccountDataService(String acc_id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.DeleteAccountDataDao(acc_id);
	}

}
