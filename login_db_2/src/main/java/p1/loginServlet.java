package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db_2","root","test");
			Statement stmnt = con.createStatement();
			
			//stmnt.executeUpdate("insert into login values('"+email+"','"+password+"')");
			
			
		ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'" );
		//System.out.println(result.next());
		
		PrintWriter out = response.getWriter();
		
		if(result.next()) {
			out.println("welcome");
		}else {
			out.println("invalid username /paasword");
		}
			con.close();
		} catch (Exception e) {
		}
	}

}
