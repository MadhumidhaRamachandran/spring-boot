<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("C:\Users\Madhumidha\Pictures\food.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta charset="ISO-8859-1">
<title>Show Products</title>
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
		<h2>Product List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="row"></th>
					<th scope="row">ProductName</th>
					<th scope="row">Orgin</th>
					<th scope="row">Price(Rs.)</th>
					<th scope="row">Shelf Life(Days)</th>
					<th scope="row">Manufacture Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="Item">
					<tr>
						<td><input type="hidden" id="id" name="id"
							value="${Item.id}"></td>
						<td>${Item.produtName}</td>
						<td>${Item.orgin}</td>
						<td>${Item.price}</td>
						<td>${Item.shelfLife}</td>
						<td>${Item.manufDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>