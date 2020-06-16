package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.bean.Account;
import com.util.DatabaseUtil;

 public class AccountStatusTableDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Account> getCustomerStatusTableDao() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query="select acc.Customer_id,acc.Account_id,acc.Account_type,acc.acc_status,newtable.message,newtable.last_update from casestudy.account as acc inner join " + 
				"(select main.account_id, main.message, main.last_update " + 
				"from casestudy.account_status main " + 
				"inner join (select account_id, max(last_update) as last_update FROM casestudy.account_status group by account_id) sec " + 
				"on main.account_id = sec.account_id and main.last_update = sec.last_update) as newtable on acc.Account_id=newtable.account_id";
		ps = con.prepareStatement(query);
		result = ps.executeQuery();
		ArrayList<Account> accountList = new ArrayList<Account>();
		while (result.next()) {
			Account acc = new Account();
			acc.setAcc_id(result.getInt("Account_id"));
			acc.setCust_id(result.getInt("Customer_id"));;
			acc.setAcc_type(result.getString("Account_type"));
			acc.setAcc_status(result.getString("acc_status"));
			acc.setMsg(result.getString("message"));
			acc.setLast_update(result.getString("last_update"));
			

			accountList.add(acc);
//			System.out.println(eventList.toString());
		}

		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);

//		for (Event a : eventList) {
//			System.out.println("service" + a.getEvent_id());
//		}

		return accountList;
	}

}
