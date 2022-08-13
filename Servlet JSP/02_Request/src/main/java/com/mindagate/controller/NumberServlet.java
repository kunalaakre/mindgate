package com.mindagate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String num1 = request.getParameter("num1");
		int no1 = Integer.parseInt(num1);
		String num2 = request.getParameter("num2");
		int no2 = Integer.parseInt(num2);
		
		String chooice = request.getParameter("operation");
		PrintWriter out = response.getWriter();
		
		
		switch(chooice)
		{
		case "Add": 
			
			out.println("Addition of "+no1 + " and "+no2 +" is "+(no1+no2));
		break;
		
		case "substract":
			 
			out.println("Substraction of "+no1 + " and "+no2 +" is "+(no1-no2));
		break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
