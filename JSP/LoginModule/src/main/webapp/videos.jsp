<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
Videos page
<%
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>
https://www.youtube.com/watch?v=vtcVawwJaK8
</body>
</html>