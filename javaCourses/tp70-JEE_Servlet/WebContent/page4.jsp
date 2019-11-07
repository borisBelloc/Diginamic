<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags/utils" prefix="u" %>
<%@ taglib uri="WEB-INF/customtags.tld" prefix="d" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%-- <%@ include file="common/header.jsp" %> --%>
	<jsp:include page="common/header.jsp"></jsp:include>

	<p>Bonjour <u:uppercase>${connectedUser}</u:uppercase>, nous sommes le <d:dateFormatter date="<%= new Date() %>" format="dd MMM yyyy"></d:dateFormatter>, comment ça va aujourd'hui ?</p> 
	
	<form action="valider.do">
		<input type="radio" name="cava" value="true">Oui</input>
		<input type="radio" name="cava" value="false">Non</input>
		<input type="submit" value="Valider"/>
	</form>
	
	<%@ include file="common/footer.jsp" %>
</body>
</html>