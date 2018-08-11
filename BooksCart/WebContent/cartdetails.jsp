<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
<meta charset="ISO-8859-1">
<title>Cart Details</title>
<style>
body {
	 justify-content: space-between;
}</style>
</head>
<div class="navbar-fixed">
	<nav>
		<jsp:include page="headers.jsp"></jsp:include>
	</nav>
	</div>
	
<body>
	<h4 align="center">
		Cart Details
	</h4>
	<div align="center" class="container">
	<jstl:if test="${requestScope.cartCount==0}">
			<h5 align="center">Add some books to your cart!!!!</h5>
		</jstl:if></div>
	<div align="center" class="container">
		<jstl:if test="${requestScope.cartCount > 0}">
			<table class="striped">
				<tr>
					<th>BookName</th>
					<th>Author</th>
					<th>ISBN</th>
					<th>Quantity</th>
					<th>Unit Price</th>
					<th>Total Price</th>
					<th>...</th>
				</tr>
				<jstl:forEach var="book" items="${requestScope.cartlist}">
					<tr>
						<td>${book.title}</td>
						<td>${book.author}</td>
						<td>${book.isbn}</td>
						<td>${book.quantity}</td>
						<td>${book.price}</td>
						<td>${book.totalPrice}</td>
						<td><a href="removeFromCart.AppController?isbn=${book.isbn}"><i class="small material-icons left">remove_shopping_cart</i></a></td>
					</tr>
				</jstl:forEach>
				<tr>
					<td></td>
					<td></td>
					<td><h5>Total:</h5></td>
					<td><h5>${requestScope.totalQtyAndPrice[0]}</h5></td><td></td>
					<td><h5>${requestScope.totalQtyAndPrice[1]}</h5></td>
					<td></td>
					</tr>
			</table>
		</jstl:if>
	</div>
</body>
<jsp:include page="footers.jsp"></jsp:include>
</html>