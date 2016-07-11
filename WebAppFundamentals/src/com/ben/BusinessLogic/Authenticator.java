package com.ben.BusinessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ben.DBUtils.DBConnection;

public class Authenticator {
	
	public int authenticateLogin(String username, String password){
		Connection conn = DBConnection.createConnection();
		String getUser = "SELECT B_User_ID FROM B_User WHERE Username = '" + username + "' AND Password = '" + password + "'";
		
		if (username == null){
			return -2;
		}
		else if (password == null){
			return -3;
		}
		try {
			PreparedStatement ps = conn.prepareStatement(getUser);
			ResultSet results = ps.executeQuery();
			int b_User_ID = 0;	
				while (results.next()){
					b_User_ID = results.getInt("B_User_ID");
				}
			ps.close();
			results.close();
		return b_User_ID;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return -1;
	}
	
	public int authenticateSignUp(){
		return 0;
		
	}
	
}
