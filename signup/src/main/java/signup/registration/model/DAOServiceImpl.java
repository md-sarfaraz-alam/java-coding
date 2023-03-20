package signup.registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;

	@Override
	public void connectDB() {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_registration", "root", "test");
     System.out.println(con);
	 stmnt = con.createStatement();


} catch (Exception e) {
       e.printStackTrace();		
	}
}

	@Override
	public void SaveRegister(String uname, String upwd, String uemail, String umobile) {
try {
	stmnt.executeUpdate("insert into registration values('"+uname+"','"+upwd+"','"+uemail+"','"+umobile+"')");
	
	
} catch (Exception e) {
e.printStackTrace();
}		
	}

	@Override
	public boolean verifyLogin(String uemail, String upwd) {
	try {
		ResultSet result = stmnt.executeQuery("select * from registration where uemail='"+uemail+"' and upwd='"+upwd+"'");
		  return result.next();
	} catch (Exception e) {
e.printStackTrace();
}
	return false;
	}










}


