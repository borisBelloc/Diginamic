<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="cus" uri="WEB-INF/customtags.tld" %>
<%@ taglib prefix="uti" tagdir="/WEB-INF/tags/utils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@ include file="common/header.jsp" %>
	
	<p>
		Bonjour, nous sommes le :
		<cus:dateFormatter date="<%= new Date() %>" format="dd/MM/yyyy HH:mm:ss" />
	</p>
	
	<p>
		<uti:uppercase>Je suis en majuscule, merci, bisous.</uti:uppercase>
	</p>
	
	
	<form action="valider.do" method="post">
		<input type="text" name="nom" />
		<input type="submit" value="Valider" />
	</form>
	
	<%@ include file="common/footer.jsp" %>
</body>
</html>