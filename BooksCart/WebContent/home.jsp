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
<title>Add Books to Cart</title>
</head>
<div class="navbar-fixed">
	<nav>
		<jsp:include page="headers.jsp"></jsp:include>
	</nav>

</div>
<body>
	<div class="container" align="center">

		<table class="striped">
			<tr>
				<th>BookName</th>
				<th>Author</th>
				<th>ISBN</th>
				<th>Price</th>
				<th>...</th>
			</tr>
			<jstl:forEach var="book" items="${requestScope.booklist}">
				<tr>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td>${book.isbn}</td>
					<td>${book.price}</td>
					<td><a href="addToCart.AppController?isbn=${book.isbn}"> <i
							class="material-icons">add_shopping_cart</i></a></td>
				</tr>
			</jstl:forEach>
		</table>
	</div>

</body>
<jsp:include page="footers.jsp"></jsp:include>
</html>