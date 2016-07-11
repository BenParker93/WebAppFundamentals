package com.ben.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ben.BusinessLogic.Report;
import com.ben.Models.M_Product;

/**
 * Servlet implementation class SaveRelo
 */
@WebServlet("/SaveReport")
public class SaveReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveReport() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<M_Product> allProducts = new ArrayList<M_Product>();
		Report report = new Report();
		
		ArrayList<String> listedProducts = new ArrayList<String>();
		
		allProducts = report.allProductReport(0);
		
		System.out.println(allProducts.size());
		
		for (int i = 0 ; i < allProducts.size() ; i++){
			String product_ID = "" + allProducts.get(i).getB_Product_ID();
			
			System.out.println(request.getParameter(product_ID));
			
			if (request.getParameter(product_ID) != null){
				listedProducts.add(product_ID);

				System.out.println(product_ID);
			
			}
		}
	}

}
