<%@ page import = "java.time.format.DateTimeFormatter" %>
<%@ page import = "java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<% String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern(" dd/MM/yyy HH:mm:ss")); %>
	
	<h1>Date du jour :</h1>
	<h2><%= now %> </h2>	
	
	
</body>
</html>