package com.ben.BusinessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.ben.DBUtils.DBConnection;
import com.ben.Models.M_Product;

public class SaveReport {
	public ArrayList<String> saveProducts(ArrayList<M_Product> products, HttpServletRequest request){
		ArrayList<M_Product> allProducts = new ArrayList<M_Product>();
		ArrayList<String> listedProducts = new ArrayList<String>();
		Report report = new Report();
		
		allProducts = report.allProductReport(0);
		
		for (int i = 0 ; i < allProducts.size() ; i++){
			String product_ID = "" + allProducts.get(i).getB_Product_ID();
			if (request.getParameter(product_ID) != null){
				listedProducts.add(product_ID);
			}
		}
		return listedProducts;
	}
	
	public void updateListedProductTable(ArrayList<String> listProducts){
		Connection conn = DBConnection.createConnection();
		StringBuffer updateSQL = new StringBuffer();
		Report productReport = new Report();
		ArrayList<M_Product> allProds = productReport.allProductReport(0);
		
		for (int i = 0; i < listProducts.size() ; i++){
			if (allProds.get(i).getB_Product_ID() == Integer.parseInt(listProducts.get(i))){
				updateSQL.append("INSERT INTO B_ListProduct (Name, Portion_Type, Portion_Size) VALUES '" + allProds.get(i).getName() + "', ");
				updateSQL.append("'" + allProds.get(i).getPortionType() + "', '" + allProds.get(i).getPortionSize() + "'");
		}
		PreparedStatement ps;
			try {
				ps = conn.prepareStatement(updateSQL.toString());
				ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int checkForDuplicate(){
		Connection conn = DBConnection.createConnection();
		StringBuffer 
		PreparedStatement ps = conn.prepareStatement(sql);
		return 0;
		
	}
}
