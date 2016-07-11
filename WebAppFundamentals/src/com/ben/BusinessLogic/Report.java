package com.ben.BusinessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ben.DBUtils.DBConnection;
import com.ben.Models.M_Product;

public class Report {
	public ArrayList<M_Product> allProductReport(int b_User_ID){
		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT B_Product.B_Product_ID, B_Product.name, B_Product.Portion_Type, B_Product.Portion_Size FROM B_Product ");
		
		ArrayList<M_Product> allProducts = new ArrayList<M_Product>();
		
		Connection conn = DBConnection.createConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				M_Product product = new M_Product();
				product.setB_Product_ID(rs.getInt("B_Product_ID"));
				product.setName(rs.getString("Name"));
				product.setPortionSize(rs.getInt("Portion_Size"));
				product.setPortionType(rs.getString("Portion_Type"));
				allProducts.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allProducts;
	}
}
