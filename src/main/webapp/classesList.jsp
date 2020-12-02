<%@page import="com.Bean.AllStudents"%>
<%@page import="com.Bean.AllClasses"%>
<%@page import="com.DAO.ClassesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Displaying Classes List</h1>
	</center>
	<center>
	<pre>Note : As we have class five(V) to class(X) only</pre>
	<pre> there is no scope to add new classes, you can only</pre>
	<pre> view list of classes and perform different operations</pre>
	</center>
	<table border="1" width="500" align="center">
		<tr>
			<th>Class</th>
			<th>Subject Code</th>
		</tr>

		<%Object obj=session.getAttribute("listOfClasses");
if(obj != null){
ArrayList<AllClasses> alist=(ArrayList<AllClasses>)obj;
for(AllClasses cs:alist){
%>
		<tr>
			<td><%= cs.getClassName()%></td>
			<td><%= cs.getSubjectCode()%></td>
		</tr>
		<%} }%>

	</table>
	<hr />



</body>
</html>