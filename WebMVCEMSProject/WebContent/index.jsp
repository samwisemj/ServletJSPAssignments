<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<jsp:include page="header.jsp"></jsp:include>
	</div>

	<div>
		<a href="loginForm.app">Login</a><br /> 
		<a href="home.app?username=Guest">Guest</a>
	</div>

	<div>
		<jsp:include page="footer.html"></jsp:include>
	</div>
</body>
</html>