package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DatabaseUtil;

public class DeleteAccountDao {
	Connection con = null;
	PreparedStatement ps = null;
	boolean flag = false;
	public boolean DeleteAccountDataDao(String acc_id) throws SQLException {
		// TODO Auto-generated method stub
		con = DatabaseUtil.getConnection();
		String query = "UPDATE casestudy.account SET acc_status = 'InActive' WHERE Account_id ="+Integer.parseInt(acc_id);
		ps = con.prepareStatement(query);

		int result = ps.executeUpdate();
		DatabaseUtil.closeStatement(ps);
		DatabaseUtil.closeConnection(con);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

}
