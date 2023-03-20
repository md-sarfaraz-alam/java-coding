package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
	  try {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the name");
		  String name=sc.next();
		  
		  System.out.println("enter the city");
		  String city=sc.next();
		  
		  System.out.println("enter the email");
		  String email=sc.next();
		  
		  System.out.println("enter the mobile");
		  String mobile=sc.next();
		  Connection con = DriverManager.getConnection
				  ("jdbc:mysql://127.0.0.1/simpledb","root","test");
		  System.out.println(con);
		  			Statement stmnt = con.createStatement();
		  			stmnt.executeUpdate
		  ("insert into registration value('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		  			
		  			con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
  }

}
