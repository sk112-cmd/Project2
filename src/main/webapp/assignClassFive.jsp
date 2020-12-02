<%@page import="com.Bean.AllClassSubject"%>
<%@page import="com.DAO.ClassSubjectAssignmentDAO"%>
<%@page import="com.Bean.AllTeachers"%>
<%@page import="com.DAO.TeachersDAO"%>
<%@page import="com.DAO.SubjectsDAO"%>
<%@page import="com.Bean.AllSubjects"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assign Teacher For Subject</title>
</head>
<body>
<center>
<h1>Assign Teacher for a Subject</h1>
<form action="AddClassFiveSubjectTeacher" method="post">

<h2>
Select Subject

<select name="subjectToSelect">
<%
String className="V";
ClassSubjectAssignmentDAO dao=new ClassSubjectAssignmentDAO();
ArrayList<AllClassSubject> bean = dao.getSelectiveSubjects(className);
for (AllClassSubject acs : bean){
%>
<option value=<%= acs.getSubjectName() %>><%=acs.getSubjectName()%></option>
<% } %>
</select>
<br>
<br>
Select Teacher

<select name="teacherToSelect">
<%
TeachersDAO tdao=new TeachersDAO();
ArrayList<AllTeachers> tList=tdao.listTeachers();
for(AllTeachers t :tList){
%>
<option value=<%=t.getTeacherName()%>><%= t.getTeacherName() %></option>
<%} %>
</select>
<br>
<br>


<input type="submit" value="Assign">
</h2>
</form>
</center>
</body>
</html>