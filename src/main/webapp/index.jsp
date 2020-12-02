<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learner Academy</title>
</head>
<body>
	<center>
		<h1>Welcome to Learners Academy Online School Administration
			Portal</h1>
		<br> <br>
		<center>
			Learners Academy is a school that has an online management system. <br>The
			system keeps track of its classes, subjects, students, and teachers.
			<br>
			<br>It has a back-office application with a single administrator
			login.
		</center>

		<br> <br>
		<form action="loginControl" method="post">
			<pre>
<b>Username : <input type="text" name="username"
					placeholder="Username">

Password : <input type="password" name="password" placeholder="Password"><b>
<br>
<br>
           <input type="submit" value="Login">
           

			</pre>
		</form>

	</center>
	
</body>
</html>