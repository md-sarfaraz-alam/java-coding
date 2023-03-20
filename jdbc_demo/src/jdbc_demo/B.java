package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		  try {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter the email");
			  String email=sc.next();
			  Connection con = DriverManager.getConnection
					  ("jdbc:mysql://127.0.0.1/simpledb","root","test");
			  System.out.println(con);
			  			Statement stmnt = con.createStatement();
			  			stmnt.executeUpdate
			  ("delete from registration where email='"+email+"'");
			  			
			  			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	  }


}
