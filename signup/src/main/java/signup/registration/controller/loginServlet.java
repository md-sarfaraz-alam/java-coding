package signup.registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signup.registration.model.DAOService;
import signup.registration.model.DAOServiceImpl;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public loginServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("password");
		
		System.out.println(uemail);
		System.out.println(upwd);
		

		DAOService dao=new DAOServiceImpl();
		
		
		dao.connectDB();
		boolean status = dao.verifyLogin(uemail,upwd);
		System.out.println(status);
		
		
	}

}
