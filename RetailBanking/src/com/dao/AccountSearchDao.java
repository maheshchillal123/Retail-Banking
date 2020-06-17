package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.bean.Customer;
import com.util.DatabaseUtil;

public class AccountSearchDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Account> getAccountDetailsDao(String acc_id, String cust_id) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		if(acc_id!="") {
			query = "select account.customer_id,account.account_id,account.account_type,account.balance,account.acc_status from casestudy.account where account_id="+Integer.parseInt(acc_id);
		}
		else {
			query = "select account.customer_id,account.account_id,account.account_type,account.balance,account.acc_status from casestudy.account where Customer_id="+Integer.parseInt(cust_id);
		}
		ps = con.prepareStatement(query);
		ArrayList<Account> lst=new ArrayList<Account>();
		result=ps.executeQuery();
		while(result.next()) {
			Account acc=new Account();
			acc.setCust_id(result.getInt("Customer_id"));
			acc.setAcc_id(result.getInt("Account_id"));
			acc.setAcc_type(result.getString("Account_type"));
			acc.setCurrent_balance(result.getInt("Balance"));
			acc.setAcc_status(result.getString("acc_status"));
			lst.add(acc);
			
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return lst;
	}

}
