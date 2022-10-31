<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp 4 Tags</title>
</head>
<body>
1. Directive
2. Declaration
3. Scriptlet
4. Expression
<h1> Variable Declaration and method definition </h1>
<%! int i=10; 

%>
<h1> Service Method</h1>
<%

%>
<h1> Expression </h1>
value of i is: <%= i %>
</body>
</html>