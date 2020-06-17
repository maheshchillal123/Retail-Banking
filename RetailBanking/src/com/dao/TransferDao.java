package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Account;
import com.bean.Transfer;
import com.util.DatabaseUtil;

public class TransferDao {
	Connection con1 = null;
	PreparedStatement ps1 = null;
	boolean flag1 = false;
	
	static Connection con = null;
	static PreparedStatement ps = null;
	boolean flag = false;
	public static ArrayList<Account> checkStatusOfTarget(String cust_id) throws SQLException {
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query = null;
		query = "select account.Account_id,account.Account_type,account.acc_status,account.Balance from casestudy.account where Customer_id="+Integer.parseInt(cust_id);
		ps = con.prepareStatement(query);
		ArrayList<Account> lst=new ArrayList<Account>();
		result=ps.executeQuery();
		//AccAndType a=new AccAndType();
		while(result.next()) {
			Account acc=new Account();
			acc.setAcc_id(result.getInt("Account_id"));
			acc.setAcc_status(result.getString("acc_status"));
			acc.setAcc_type(result.getString("Account_type"));
			acc.setCurrent_balance(result.getInt("Balance"));
			lst.add(acc);
			//a.setAccount_and_type(acc);
			
		}
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		return lst;
		
	}
	public ArrayList transferAmountDao(Transfer src, Transfer trg) throws SQLException {
		// TODO Auto-generated method stub
		con1 = DatabaseUtil.getConnection();
		String query="INSERT INTO casestudy.transaction (Customer_id,Account_id,Account_type,Trans_amount,transaction_date,Source_acct_type,target_acct_type,Trans_id,Trans_type) VALUES (?,?,?,?,?,?,?,?,?);";
		ps1=con1.prepareStatement(query);
		ps1.setInt(1, src.getCust_id());
		ps1.setInt(2, src.getAcc_id());
		ps1.setString(3, src.getAcc_type());
		ps1.setInt(4, src.getTrans_balance());
		ps1.setString(5, src.getTrans_date());
		ps1.setString(6, src.getAcc_type());
		ps1.setString(7, trg.getAcc_type());
		ps1.setString(8, src.getTrans_id());
		ps1.setString(9, src.getTrans_type());
		
		int result = ps1.executeUpdate();
		DatabaseUtil.closeStatement(ps1);
		DatabaseUtil.closeConnection(con1);
		ArrayList res=new ArrayList();
		if(result>0) {
			res.add(addTransferAmount(src.getTrans_balance(),trg.getAcc_id(),trg.getBefore_balance()));
			res.add(withdrawTransferAmount(src.getTrans_balance(),src.getAcc_id(),src.getBefore_balance()));
			return res;
		}
		else {
			return null;
		}
	}
	private int withdrawTransferAmount(int trans_balance, int src_id, int before_balance) throws SQLException {
		// TODO Auto-generated method stub
		con1 = DatabaseUtil.getConnection();
		int total_balance=before_balance-trans_balance;
		String query = "UPDATE casestudy.account SET Balance = "+total_balance+" WHERE Account_id ="+src_id;
		ps1 = con1.prepareStatement(query);

		int result = ps1.executeUpdate();
		DatabaseUtil.closeStatement(ps1);
		DatabaseUtil.closeConnection(con1);
		if (result > 0) {
			return total_balance;
		} else {
			return -1;
		}
	}
	private int addTransferAmount(int trans_balance, int trg_acc, int before_balance) throws SQLException {
		// TODO Auto-generated method stub
		con1 = DatabaseUtil.getConnection();
		int total_balance=before_balance+trans_balance;
		String query = "UPDATE casestudy.account SET Balance = "+total_balance+" WHERE Account_id ="+trg_acc;
		ps1 = con1.prepareStatement(query);

		int result = ps1.executeUpdate();
		DatabaseUtil.closeStatement(ps1);
		DatabaseUtil.closeConnection(con1);
		if (result > 0) {
			return total_balance;
		} else {
			return -1;
		}
	}
}
