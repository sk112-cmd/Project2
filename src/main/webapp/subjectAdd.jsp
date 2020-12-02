<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Subjects</title>
</head>
<body>
	<center>
		<h1>
			Add Subjects</b>
		</h1>

		<form action="AddSubjectsService" method="post">

			<h2>
				Subject Name : <input type="text" name="subjectName">
			</h2>
			<pre>
*Note : Enter Subject Name
</pre>
			<br>
			<h2>
				Subject Description : <input type="text" name="subjectDescription">
			</h2>
			<pre>
*Note : Enter subject Description
</pre>
			<br> <br> <input type="submit" value="Add Subject">
			<br> <br>
			</pre>
	</center>
</body>
</html>