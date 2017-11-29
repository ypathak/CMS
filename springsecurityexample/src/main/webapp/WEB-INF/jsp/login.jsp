<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="loginurl" value="/loginurl"></c:url>
	<c:if test="${param.error != null}">
     Username and password Wrong
</c:if>
	<c:if test="${param.logout != null}">
     You have been logout
</c:if>
	<form action="${loginurl}" method="post">
		<table>
		<b>Login page</b>
		<div>
		<tr>
			<td><label for="username">Username</label></td><td> <input type="text"
				id="username" name="username"></td>
		</tr>
		</div>
		<div>
		<tr>
			<td><label for="password">Password </label></td><td> <input type="password"
				id="password" name="password"></td>
	</tr>
		</div>
		<div>
		<tr>
		<td>	<input type="submit" value="login">
		       
		</td>
		</tr>
		<tr>
		<td><a href="register">Click here for register</a></td>
		</tr>
		</div>
</table>
	</form>
</body>
</html>