package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		String login, password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		
		if(login.equals("kunal") && password.equals("aakre"))
		{
			response.sendRedirect("home.html");
		}
		
		else
		{
			response.sendRedirect("invalid.html");
		}
	}

}
