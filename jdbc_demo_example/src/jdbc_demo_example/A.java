package jdbc_demo_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("Jdbc:mysql://localhost/simpledb", "root", "test");
			System.out.println(con);
			
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into registration values('stallin','chennai','stallin@gmail.com','9365214700')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
