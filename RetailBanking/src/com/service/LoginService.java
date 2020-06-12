package com.service;

import java.sql.SQLException;

import com.dao.LoginDao;

public class LoginService {
	LoginDao dao=new LoginDao();
	public String validateLoginService(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		return dao.validateLoginDao(email,password);
	}

}
