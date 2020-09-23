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
<form:form modelAttribute="product" action="/product-info" method="post">
      <h3>Send Product Details</h3>
      <table>
          <tr>
              <td style="height:30px">Product Id:</td>
              <td><form:input path="productId" /></td>
          </tr>
          <tr>
              <td style="height:30px">Product Name:</td>
              <td><form:input path="name" /></td>
          </tr>
          <tr>
              <td style="height:10px">
                  <input type="submit" value="Submit" />
              </td>
          </tr>
      </table>
  </form:form>
<h4><a href="/home">home</a></h4>
</body>
</html>