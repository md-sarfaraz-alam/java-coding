package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/second")
public class SecondServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SecondServlet2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name =(String) request.getAttribute("name");
			System.out.println(name);
			
	}
	
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name =(String) request.getAttribute("name");
		System.out.println(name);
		
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionName"));
	
	}

}
