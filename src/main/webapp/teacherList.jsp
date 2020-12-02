<%@page import="com.Bean.AllTeachers"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<title>Teacher's List</title>
</head>
<body>


	<center>
		<h1>Displaying Teachers List</h1>
	</center>
	<table border="1" width="500" align="center">
		<tr>
			<th>Teacher Id</th>
			<th>Teacher Name</th>
			<th>Teacher Qualification</th>
		</tr>

		<%
			Object obj = session.getAttribute("listOfTeachers");
		if (obj != null) {
			ArrayList<AllTeachers> alist = (ArrayList<AllTeachers>) obj;
			for (AllTeachers s : alist) {
		%>

		<tr>
			<td><%=s.getTeaherId()%></td>
			<td><%=s.getTeacherName()%></td>
			<td><%=s.getTeacherQualification()%></td>
		</tr>
		<%
			}
		}
		%>

	</table>
	<hr />
</body>
</html>