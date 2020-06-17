package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Transfer;
import com.util.DatabaseUtil;

public class StatementTableDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public ArrayList<Transfer> getStatementTableDao(String acc_id, int no_trans) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet result = null;
		con = DatabaseUtil.getConnection();
		String query="select transaction.trans_id,transaction.Trans_type,transaction.Transaction_date,transaction.Trans_amount from casestudy.transaction where transaction.account_id="+acc_id+" order by transaction.Transaction_date limit "+no_trans;
		ps = con.prepareStatement(query);
		result = ps.executeQuery();
		ArrayList<Transfer> transList = new ArrayList<Transfer>();
		while (result.next()) {
			Transfer trans = new Transfer();
			trans.setTrans_id(result.getString("Trans_id"));
			trans.setTrans_type(result.getString("trans_type"));
			trans.setTrans_date(result.getString("Transaction_date"));
			trans.setTrans_balance(result.getInt("Trans_amount"));

			transList.add(trans);
//			System.out.println(eventList.toString());
		}

		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);

//		for (Event a : eventList) {
//			System.out.println("service" + a.getEvent_id());
//		}

		return transList;
	}

}
