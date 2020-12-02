<%@page import="com.Bean.AllClassSubjectTeacher"%>
<%@page import="com.Bean.AllSubjects"%>
<%@page import="com.Bean.AllStudents"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAO.StudentsDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report For Class Five</title>
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

	<h1>Displaying Teacher List for Class - V</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
		<tr>
			<th>Teacher Name</th>
			<th>Class</th>
			<th>Subject Name</th>
		</tr>
		<%
			Object obj1 = session.getAttribute("listOfTeachersWithClass");
		if (obj != null) {
			ArrayList<AllClassSubjectTeacher> alist = (ArrayList<AllClassSubjectTeacher>) obj1;
			for (AllClassSubjectTeacher s : alist) {
		%>

		<tr>
			<td><%=s.getTeacherName()%></td>
			<td><%=s.getClassName()%></td>
			<td><%=s.getSubjectName()%></td>
		</tr>
		<%
			}
		}
		%>

	</table>
	</center>
</body>
</html>