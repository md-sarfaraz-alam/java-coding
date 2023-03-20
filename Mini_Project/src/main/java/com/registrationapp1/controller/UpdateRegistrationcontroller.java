package com.registrationapp1.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationapp1.model.DAOService;
import com.registrationapp1.model.DAOServiceimpl;

@WebServlet("/update")
public class UpdateRegistrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateRegistrationcontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/update_registration.jsp");
		 rd.forward(request, response);


		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOService dao=new DAOServiceimpl();
		dao.connectDB();
		dao.updateReg(email,mobile);
		
ResultSet result = dao.getAllReg();
		
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_registrations.jsp");
		 rd.forward(request, response);
	}

}
