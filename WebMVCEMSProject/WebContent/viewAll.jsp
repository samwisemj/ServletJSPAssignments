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
		<h1>Employees List</h1>
		<jstl:if test="${requestScope.employees.size() > 0 }">
			<table>
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
				</tr>
				<jstl:forEach var="employee" items="${requestScope.employees }">
					<tr>
						<td>${employee.empId}</td>
						<td>${employee.empName}</td>
						<td><a href="delete.app?empId=${employee.empId}">Delete</a></td>
						<td><a href="editform.app?empId=${employee.empId}">Edit</a></td>
					</tr>
				</jstl:forEach>
			</table>

		</jstl:if>
		<jstl:if test="${requestScope.employees.size() == 0 }">
			<h4>No Employee Found!</h4>
		</jstl:if>
	</div>
<div>
		<jsp:include page="footer.html"></jsp:include>
	</div>
</body>
</html>