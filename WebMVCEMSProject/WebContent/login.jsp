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
	<div align="center">
		<form action="login.app" method="post">
			<input type="text" name="txtUserName" required="required" /> <br />
			<input type="password" name="txtPassword" required="required" /><br />
			<input type="submit" value="Save" />
		</form>
	</div>
	<div>
		<jsp:include page="footer.html"></jsp:include>
	</div>
</body>
</html>