<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Fiel</title>
</head>
<body>
<h3>JSP is Simple</h3>

<%!String message = "Java is Best";%>
<%! Date date = new Date(); %>



<% 
for(int i=1;i<10;i++) {
%>
<h3>JSP is Simple</h3>
<%=message.toUpperCase() %>\
<%=date%>
<%
}
%>
</body>
</html>