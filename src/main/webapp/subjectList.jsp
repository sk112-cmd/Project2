<%@page import="com.Bean.AllSubjects"%>
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

</style>
<title>Insert title here</title>
</head>
<body>


	<center>
		<h1>Displaying Subjects List</h1>
	</center>
	<table border="1" width="500" align="center">

		<tr>
			<th>Subject Id</th>
			<th>Subject Name</th>
			<th>Subject Description</th>
		</tr>

		<%
			Object obj = session.getAttribute("listOfSubjects");
		if (obj != null) {
			ArrayList<AllSubjects> alist = (ArrayList<AllSubjects>) obj;
			for (AllSubjects s : alist) {
		%>
		<tr>
			<td><%=s.getSubjectId()%></td>
			<td><%=s.getSubjectName()%></td>
			<td><%=s.getSubjectDescription()%></td>
		</tr>
		<%
			}
		}
		%>

	</table>
	<hr />
</body>
</html>