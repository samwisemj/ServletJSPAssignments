<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<div style="align: center;">
		<form action="save.app" method="get">
			<jstl:if test="${requestScope.employee != null }">
				<input type="number" name="txtId" required="required"
					readonly="readonly" value="${requestScope.employee.empId}" />
				<br />
			</jstl:if>
			<jstl:if test="${requestScope.employee == null }">
				<input type="number" name="txtId" required="required" />
				<br />
			</jstl:if>

			<input type="text" name="txtName" required="required"
				value="${requestScope.employee.empName }" /><br /> <input
				type="submit" value="Save" />
		</form>
	</div>
	<div>
		<jsp:include page="footer.html"></jsp:include>
	</div>
</body>
</html>