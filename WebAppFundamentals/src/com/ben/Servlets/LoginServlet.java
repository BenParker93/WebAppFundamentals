package com.ben.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ben.BusinessLogic.Authenticator;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("Username");
		String pass = request.getParameter("Password");
		String url = null;
		Authenticator auth = new Authenticator();
		int authenticate = auth.authenticateLogin(user, pass);
		if (authenticate > 0){
			request.getSession().setAttribute("B_User_ID", authenticate);
			url = "/jsp/mainMenu.jsp";
		}
		else {
			url = "/LoginServlet";
		}
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);	}

}
