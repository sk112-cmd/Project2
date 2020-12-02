<%@page import="com.Service.ListStudentsService"%>
<%@page import="com.Bean.AllStudents"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Student List</title>
</head>
<body>


	<center>
		<h1>Displaying Student List</h1>
	</center>
	<table border="1" width="500" align="center">
		<tr>
			<th>Student Name</th>
			<th>Student Class</th>
			<th>Subject Code</th>
		</tr>

		<%
			Object obj = session.getAttribute("listOfStudents");
		if (obj != null) {
			ArrayList<AllStudents> alist = (ArrayList<AllStudents>) obj;
			for (AllStudents s : alist) {
		%>

		<tr>
			<td><%=s.getStudentName()%></td>
			<td><%=s.getStudentClass()%></td>
			<td><%=s.getSubjectCode()%></td>
		</tr>
		<%
			}
		}
		%>

	</table>
	<hr />
</body>
</html>