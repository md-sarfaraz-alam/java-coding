package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("firstname");
	System.out.println(name);
	request.setAttribute("name", name);
	
	RequestDispatcher rd = request.getRequestDispatcher("second");
		rd.forward(request, response);
	}

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("firstname");
	//System.out.println(name);
	request.setAttribute("name", name);
	
	HttpSession session = request.getSession();
	session.setAttribute("sessionName", name);
	
	RequestDispatcher rd = request.getRequestDispatcher("second");
	rd.forward(request, response);
	
	}

}
