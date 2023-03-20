package com.web_app_9.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_9.model.Addnumbers;


@WebServlet("/addcontroller")
public class Addcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Addcontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2=Integer.parseInt(request.getParameter("number2"));
		
		Addnumbers add=new Addnumbers();
		int res = add.addnumbers(num1, num2);
		
		request.setAttribute("result", res);
		RequestDispatcher rd = request.getRequestDispatcher("app_numbers.jsp");
		rd.forward(request, response);
	}

}
