<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String name=(String)request.getAttribute("userName");
	
	%>
	<h1>Welcome <%=name %> you are successfully logged in!!!</h1>
</body>
</html>