<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boom</title>
</head>
<body>


<%! String username; %>

<%
username=request.getParameter("name");%>


Hello <%=username %>




</body>
</html>