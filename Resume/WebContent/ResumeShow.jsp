<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.cg.pojo.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
	<table align = "center">
		<tr>
		<td><h1>Resume</h1></td>
		</tr>
		
		<tr>
			<td>Name:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getFirstName() %>&nbsp;
			<%= ((Person)(request.getAttribute("PersonObject"))).getLastName() %></td>
			<%-- <td><img src="<%= ((Person)(request.getAttribute("PersonObject"))).getPicAddress() %>" height="100px" width="100"/></td> --%>
		</tr>
		
		<tr>
			<td>Gender</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getGender() %></td>
		</tr>
		
		<tr>
			<td>Highest Educational Qualification:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getQualification()%></td>
		</tr>
		
		<tr>
			<td>Date of Birth:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getDob() %></td>
		</tr>
		
		<tr>
			<td>Hobbies:</td>
			<td>
			<%for(String hobby : ((Person)(request.getAttribute("PersonObject"))).getHobbies()){ %>
			<%= hobby + "\t" %>
			<%} %>
			</td>
		</tr>
		
		<%-- <tr>
			<td>Address:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getAddress() %></td>
		</tr> --%>
			
		<tr>
			<td>Skills:</td>
			<td>
			<%for(String hobby : ((Person)(request.getAttribute("PersonObject"))).getSkills()){ %>
			<%= hobby + "\t" %>
			<%} %>
			</td>
		</tr>
		
		<tr>
			<td>Email ID:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getEmail() %></td>
		</tr>
		
		<tr>
			<td>URL:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getWebsite() %></td>
		</tr>
		
		<tr>
			<td>Phone:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getContact() %></td>
		</tr>
		
		<tr>
			<td>Summary:</td>
			<td><%= ((Person)(request.getAttribute("PersonObject"))).getBio() %></td>
		</tr>
	</table>
</body>
</html>