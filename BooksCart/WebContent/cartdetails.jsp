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

	<h5 align="right">
		<a href="redirect.AppController"> Go To Home </a>
	</h5>
	<h3 align="center">
		<b>Cart Details</b>
	</h3>


	<div align="center">
		<jstl:if test="${requestScope.cartCount > 0}">
			<table>
				<tr>
					<th>BookName</th>
					<th>Author</th>
					<th>ISBN</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>...</th>
				</tr>
				<jstl:forEach var="book" items="${requestScope.cartlist}">
					<tr>
						<td>${book.title}</td>
						<td>${book.author}</td>
						<td>${book.isbn}</td>
						<td>${book.price}</td>
						<td>${book.quantity}</td>
						<td><a href="removeFromCart.AppController?isbn=${book.isbn}">Remove
								from cart</a></td>
					</tr>
				</jstl:forEach>
			</table>
		</jstl:if>
		<jstl:if test="${requestScope.cartCount==0}">
			<h3 align="center">Add some books to your cart!!!!</h3>
		</jstl:if>
	</div>

</body>
</html>