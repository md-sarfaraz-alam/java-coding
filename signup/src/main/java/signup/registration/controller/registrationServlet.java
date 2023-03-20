package signup.registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signup.registration.model.DAOService;
import signup.registration.model.DAOServiceImpl;

@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public registrationServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String upwd = request.getParameter("password");
	    String uemail = request.getParameter("email");
		String umobile = request.getParameter("mobile");
		
		System.out.println(uname);
		System.out.println(upwd);
		System.out.println(uemail);
		System.out.println(umobile);
		
		
		DAOService dao=new DAOServiceImpl();
		
		
		dao.connectDB();
		dao.SaveRegister(uname,upwd,uemail,umobile);
	//	dao.verifyLogin();
	
	}
	

}
