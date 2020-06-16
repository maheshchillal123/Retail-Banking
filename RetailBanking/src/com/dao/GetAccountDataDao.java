package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.bean.Customer;
import com.util.DatabaseUtil;

public class GetAccountDataDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Account> getAccountDetailsDao(String ssn, String id) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		if(ssn!="") {
			query = "select account.Account_id,account.Account_type from casestudy.account where account.customer_id=(select customer.customer_id from casestudy.customer where SSN="+Integer.parseInt(ssn)+")";
		}
		else {
			query = "select account.Account_id,account.Account_type from casestudy.account where Customer_id="+Integer.parseInt(id);
		}
		ps = con.prepareStatement(query);
		ArrayList<Account> lst=new ArrayList<Account>();
		result=ps.executeQuery();
		//AccAndType a=new AccAndType();
		while(result.next()) {
			Account acc=new Account();
			acc.setAcc_id(result.getInt("Account_id"));
			acc.setAcc_type(result.getString("Account_type"));
			lst.add(acc);
			//a.setAccount_and_type(acc);
			
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return lst;
	}

}
