<%@page import="com.Bean.AllClasses"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Students</title>
</head>
<body>
	<center>
		<h1>
			Add Students</b>
		</h1>

		<form action="AddStudentsService" method="post">

			<h2>
				Student Name : <input type="text" name="studentName">
			</h2>
			<pre>
*Note : Enter Full Name of the student, i.e Rohit Sharma
</pre>
			<br>

			<h2>
				Student Class : <input type="text" name="studentClass">
			</h2>
			<pre>
*Note : Enter student classes as Roman numeric, i.e for class Five enter V
</pre>
			<br> <br> <input type="submit" value="Add Student">
			<br> <br>
			</pre>
	</center>
</body>
</html>