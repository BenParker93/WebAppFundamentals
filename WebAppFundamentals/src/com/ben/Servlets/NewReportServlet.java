package com.ben.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ben.BusinessLogic.Report;

@WebServlet("/NewReportServlet")
public class NewReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewReportServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Report report = new Report();
		
		// The createNew method returns a arraylist of all products in database, and need User_ID as a parameter for SQL query
		
		request.setAttribute("AllProducts", report.allProductReport((int)(request.getSession().getAttribute("B_User_ID"))));
		
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/jsp/NewReport.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
