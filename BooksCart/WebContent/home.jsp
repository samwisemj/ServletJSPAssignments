<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Books to Cart</title>
</head>
<body>
	<div style="align-content: flex-end;">
		<h3 align="right">
			<a href="viewCart.AppController">Cart(${requestScope.cartCount})</a>
		</h3>
	</div>
	
	<div align="center">
	
			<table>
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
						<td><a href="addToCart.AppController?isbn=${book.isbn}">Add To Cart</a></td>
					</tr>
				</jstl:forEach>
			</table>
	</div>

</body>
</html>