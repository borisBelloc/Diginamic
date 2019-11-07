<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<jsp:doBody var="text" scope="request" />
<%
	String uppercaseText = ((String) request.getAttribute("text")).toUpperCase();
%>
<%= uppercaseText %>