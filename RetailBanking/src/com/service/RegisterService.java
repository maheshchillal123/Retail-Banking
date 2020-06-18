package com.service;

import java.sql.SQLException;

import com.dao.RegisterDao;

public class RegisterService {
	RegisterDao dao=new RegisterDao();
	public boolean registerExecutive(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return dao.registerExecutiveDao(email,pass);
	}

}
