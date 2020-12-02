<%@page import="com.DAO.SubjectsDAO"%>
<%@page import="com.DAO.ClassesDAO"%>
<%@page import="com.Bean.AllClasses"%>
<%@page import="com.Bean.AllSubjects"%>
<%@page import="com.Bean.AllTeachers"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAO.TeachersDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

#button1{
width: 300px;
height: 40px;

}
#button2{
width: 300px;
height: 40px;
}
.wrapper {
  text-align: center;
  display: inline-block;
  position: absolute;
  top: 50%;
  left: 50%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome User Page</title>
</head>
<body>
<center>
<h1>Welcome Admin User</h1>
<b>Students Management</b>
<form action="AddStudent" method="get">
<button>Add a Student</button>
</form>  
<form action="StudentsListService" method="get">
<button>View All Student Details</button> 
</form>
<br>
<b>Classes Management</b>
<form action="ClassesListService" method="get">
<button>View All Classes Details
</button>
</form>
<br>
<b>Subjects Management</b>
<form action="AddSubject" method="get">
<button>Add a Subject
</button>
</form>  <form action="SubjectsListService" method="get">
<button>View All Subjects Details
</button> </form>
<br>
<b>Teachers Management</b> 
<form action="AddTeacher" method="get">
<button>Add a Teacher
</button> </form>  <form action="TeachersListService" method="get">
<button>View All Teachers Details</button>
</form><br>
<b>Assignments</b>
<form action="AssignTeachersForSubject" method="get">
<button>Assign Teacher for a Subject</button>
</form>
<form action="AssignClassesForSubject" method="get">
<button>Assign Classes for a Subject</button>
</form>
<br>
<b>Reports</b>
<form action="ReportForClassFive" method="get">
<button>Class Report - V</button>
<pre>Note : As of Now Class V report is present. Development in progress</pre>
</form>
</center>
</body>
</html>