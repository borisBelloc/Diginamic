<%@page import="java.util.Enumeration"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Request parameters</h1>
	<h2>Java</h2>
	
	<!-- Utiliser url tel que :
	http://localhost:8080/tp70-JEE_Servlet/tp72.jsp?bonjour=bertrand&demain=lundi
	 -->
	
	<% 
	    for (Enumeration<String> en = request.getParameterNames(); en.hasMoreElements();) {
	        String parameterName = (String) en.nextElement();
	        String parameterValue = request.getParameter(parameterName);
	        out.println(parameterName + " : " + parameterValue + "<br />");
	    }
	%>
	<h2>JSTL</h2>
	<c:forEach var="parameter" items="${ param }">
		${ parameter.key } : ${ parameter.value }<br/>
	</c:forEach>

	<h1>Request attributes</h1>
	<h2>Java</h2>
	<%
  		for (Enumeration<String> en = request.getAttributeNames(); en.hasMoreElements();) {
	        String attributeName = (String) en.nextElement();
	        Object attributeValue = request.getAttribute(attributeName);
	        out.println(attributeName + " : " + attributeValue + "<br />");
		}
 	%>
	<h2>JSTL</h2>
	<c:forEach var="attribute" items="${ requestScope }">
		${ attribute.key } : ${ attribute.value }<br/>
	</c:forEach>

	<h1>Session attributes</h1>
	<h2>Java</h2>
	<%
  		for (Enumeration<String> en = session.getAttributeNames(); en.hasMoreElements();) {
	        String attributeName = (String) en.nextElement();
	        Object attributeValue = session.getAttribute(attributeName);
	        out.println(attributeName + " : " + attributeValue + "<br />");
		}
 	%>
	<h2>JSTL</h2>
	<c:forEach var="attribute" items="${ sessionScope }">
		${ attribute.key } : ${ attribute.value }<br/>
	</c:forEach>
	
	<c:set var="bonjour" value="c'est bien" scope="request"/>
	
	<!-- bertrand n'existe pas -> null -->
	Bonjour ? <%= request.getAttribute("bonjour") %> <%= request.getAttribute("bertrand") %>
	
</body>
</html>