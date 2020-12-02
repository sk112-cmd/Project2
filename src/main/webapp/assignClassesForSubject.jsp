<%@page import="com.Bean.AllSubjects"%>
<%@page import="com.DAO.SubjectsDAO"%>
<%@page import="com.Bean.AllClasses"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAO.ClassesDAO"%>
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
<h1>Assign Classes for Subject</h1>
<form action="AddClassForSubject" method="post">
<h2>
Select Class
<select name="classToSelect">
<%
ClassesDAO cdao=new ClassesDAO();
ArrayList<AllClasses> cList= cdao.listClasses();
for(AllClasses c :cList){
%>
<option value=<%=c.getClassName()%>><%= c.getClassName() %></option>
<%} %>
</select>
</h2>

<h2>
Select Subject

<select name="subjectToSelect">
<%
SubjectsDAO dao=new SubjectsDAO();
ArrayList<AllSubjects> alist=dao.listSubjects();
for(AllSubjects pb:alist){
%>
<option value=<%=pb.getSubjectName() %>><%=pb.getSubjectName() %></option>
<%} %>
</select>
<br>
<br>
<br>
<br>
<input type="submit" value="Assign">
</h2>
</center>

</body>
</html>