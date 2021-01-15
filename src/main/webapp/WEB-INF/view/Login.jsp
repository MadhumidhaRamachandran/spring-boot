<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form:form action="${pageContext.request.contextPath}/showProduct"
			modelAttribute="user" method="POST">
			<div class="form-horizontal">
				<h2>Login</h2>
				<h4 style="color: red">${message }</h4>
				<div class="form-group">
					<label class="control-label col-sm-3">User Name :</label>
					<div class="col-sm-7">
						<form:input path="email" cssClass="form-control"
							placeholder="abc@gmail.com" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3">Password :</label>
					<div class="col-sm-7">
						<input type="password" name="password" Class="form-control"
							placeholder="password" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-5 col-sm-10">
						<button type="submit" class="btn btn-primary">Submit</button>
						<button type="reset" class="btn btn-warning">Clear</button>
					</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>