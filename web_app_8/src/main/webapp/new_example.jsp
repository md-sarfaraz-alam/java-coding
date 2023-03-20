 <%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h2>Scriplet tag example</h2>
   <%
   out.println("hello");
   
   request.setAttribute("val",10000);
   out.println(request.getAttribute("val"));
   %>
   
   <%!
   public int x=100;
   public int test(){
   return 10;
   }
   %>
   
   <%=x %>
   <br>
  <%=test() %>
  <br>
  <%=10+20 %>
  <br>
  <%=x+10 %>
  
  <%=new Date()%>
   

</body>
</html>