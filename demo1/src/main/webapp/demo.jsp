<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Random rd=new Random();%>
<%long i=rd.nextLong(); %>
<%if (i<0){ %>
<h1 style="color:red;"><%=i%></h1>
<%}else{ %>
<h1 style="color:blue;"><%=i%></h1>
<%}%>
<%Date d=new Date();%>
<h3><%=d%></h3>

</body>
</html>