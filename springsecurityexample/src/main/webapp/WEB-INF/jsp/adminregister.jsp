<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Register page</h1>

 <c:url value="/admin/registeradmin" var="registerURL" />
<form:form method="POST" modelAttribute="admindata" action="${registerURL}">
<table>
  <tr>
   <td><form:label path="firstname">First Name</form:label></td>
   <td><form:input type="text" path="firstname"/> </td>
  </tr>
  <tr>
   <td><form:label path="lastname">Last Name</form:label></td>
   <td><form:input type="text" path="lastname"/> </td>
  </tr>
  <tr>
   <td><form:label path="username">User Name</form:label></td>
   <td><form:input type="text" path="username"/> </td>
  </tr>
  <tr>
   <td><form:label path="email">Email:</form:label></td>
   <td><form:input type="text" path="email"/> </td>
  </tr>
  <tr>
   <td><form:label path="password">Password</form:label></td>
   <td><form:input type="password" path="password"/> </td>
  </tr>

  </tr>
<tr>
<td><input type="submit" value="Register">
</tr>
</table> 


</form:form>
</body>
</html>