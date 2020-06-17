package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.bean.Transfer;
import com.util.DatabaseUtil;

public class DepositDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public int depositeMoneyDao(Transfer trans) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query="INSERT INTO casestudy.transaction (Customer_id,Account_id,Account_type,Trans_amount,Transaction_date,Trans_id,Trans_type) VALUES (?,?,?,?,?,?,?);";
		ps=con.prepareStatement(query);
		ps.setInt(1, trans.getCust_id());
		ps.setInt(2, trans.getAcc_id());
		ps.setString(3, trans.getAcc_type());
		ps.setInt(4, trans.getTrans_balance());
		ps.setString(5, trans.getTrans_date());
		ps.setString(6, trans.getTrans_id());
		ps.setString(7, trans.getTrans_type());
		
		int result = ps.executeUpdate();
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		if(result>0) {
			int total=addamount(trans);
			return total;
		}
		else {
			return -1;
		}
	}
	private int addamount(Transfer trans) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		int total_balance=trans.getBefore_balance()+trans.getTrans_balance();
		String query = "UPDATE casestudy.account SET Balance = "+total_balance+" WHERE Account_id ="+trans.getAcc_id();
		ps = con.prepareStatement(query);

		int result = ps.executeUpdate();
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		if (result > 0) {
			return total_balance;
		} else {
			return -1;
		}
	}

}
