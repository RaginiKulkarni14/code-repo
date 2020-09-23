<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
</style>
<meta charset="ISO-8859-1">
<title>Service Bus Queue</title>
</head>
<body>
<form:form action="/message-info" method="post">
         <h3>Send Text Message:</h3>
		<textarea name="msg" rows="2" cols="20"></textarea><br>
		<br>
		<input type="submit" value="Submit" />	
  </form:form>
<h4><a href="/home">home</a></h4>
</body>
</html>