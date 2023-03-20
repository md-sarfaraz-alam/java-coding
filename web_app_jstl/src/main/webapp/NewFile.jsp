<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="mike"></c:set>
	<c:out value="${name }"></c:out>
	
	<c:set var="val" value="${10000*2}"></c:set>
	<c:out value="${val }"></c:out>
	
	<c:if test="${val > 8000 }">
	<p>my income is:<c:out value="${val }"/><p>
	</c:if>
	
	<c:forEach var="j" begin="1" end="3">
	Item <c:out value="${j }"></c:out><p>
	</c:forEach>
</body>
</html>