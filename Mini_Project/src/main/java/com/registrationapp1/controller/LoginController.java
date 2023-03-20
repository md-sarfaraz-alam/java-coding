package com.registrationapp1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp1.model.DAOService;
import com.registrationapp1.model.DAOServiceimpl;
@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email = request.getParameter("email");
		 String paasword = request.getParameter("paasword");
		 
		 DAOService dao=new DAOServiceimpl();
		 dao.connectDB();
		 boolean status = dao.verifyLogin(email, paasword);
		 System.out.println(status);
		 
		 if(status==true) {
			 HttpSession session = request.getSession(true);
			 
			 session.setAttribute("email", email);
				session.setMaxInactiveInterval(2);

			 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/new_registration.jsp");
			 rd.forward(request, response);
			 
		 }else {
			 
			 request.setAttribute("error", "Invalid username/Paasword");
			 
			 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			 	rd.forward(request, response);
		 }

	}

}
