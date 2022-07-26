<%@page import="com.onlineStudentRegistration.entity.Student"%>
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
		Student s=(Student)request.getAttribute("student");
		String fName=s.getfName();
	
	%>

	<center><h1>Welcome <%=fName %> you are successfully register!!!!<br><br>
	
	<a href="login">click here for login</a>
	
	
	
	</h1></center>
</body>
</html>