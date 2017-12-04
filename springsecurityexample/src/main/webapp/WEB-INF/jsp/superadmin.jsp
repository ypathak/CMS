<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header"> 
		
	

		<c:url value="/admin/registeradmin" var="registerURL" /> 
		
		<form:form method="POST" modelAttribute="admindata" action="${registerURL}">
			<div class="form-group has-feedback">
<div class="row">
	<div class="col-md-6">
	<div class="register-box-body">
    <p class="login-box-msg">Register a new Admin</p>

    <form action="../../index.html" method="post">
      <div class="form-group has-feedback">
        <input class="form-control" placeholder="Full name" type="text">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input class="form-control" placeholder="Email" type="email">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input class="form-control" placeholder="Password" type="password">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input class="form-control" placeholder="Retype password" type="password">
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label class="">
              <div class="icheckbox_square-blue" style="position: relative;" aria-checked="false" aria-disabled="false"><input style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;" type="checkbox"><ins class="iCheck-helper" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;"></ins></div> I agree to the <a href="#">terms</a>
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
        </div>
        <!-- /.col -->
      </div>
    </form>

    <div class="social-auth-links text-center">
      <p>- OR -</p>
      <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign up using
        Facebook</a>
      <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign up using
        Google+</a>
    </div>

    <a href="login.html" class="text-center">I already have a membership</a>
  </div>
	
	</div>
	<div class="col-md-6"></div>
</div>
				 				


			<!-- 	</div>
			<table>
				<tr>
					<td><form:label path="firstname">First Name</form:label></td>
					<td><form:input type="text" path="firstname" /></td>
				</tr>
				<tr>
					<td><form:label path="lastname">Last Name</form:label></td>
					<td><form:input type="text" path="lastname" /></td>
				</tr>
				<tr>
					<td><form:label path="username">User Name</form:label></td>
					<td><form:input type="text" path="username" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email:</form:label></td>
					<td><form:input type="text" path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input type="password" path="password" /></td>
				</tr>

				</tr>
				<tr>
					<td><input type="submit" value="Register">
				</tr>
			</table> -->


		</form:form> </section>
		<!-- /.content -->
	</div>

</body>
</html>