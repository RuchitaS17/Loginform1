package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
	@Override
	public void init() throws ServletException
	{
		System.out.println("init");
	}
	
	protected void service(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Service");
		PrintWriter out=res.getWriter();
		String user=req.getParameter("txtuser");
		String pass=req.getParameter("txtpass");
		if(user.equals(pass))
		{
			out.println("<h1> Login Successfully </h>");
		}
		else
		{
			out.println("Login Fail");
		}
				
	}
	@Override
	public void destroy() 
	{
		System.out.println("destroy");
		
	}

}
