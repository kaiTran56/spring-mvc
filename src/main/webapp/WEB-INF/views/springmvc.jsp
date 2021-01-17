<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>
	<h1>Spring-MVC</h1>
	<h1>Menu</h1>
	<h2 style="coler: red;">This menu is Normal</h2>
	<%@include file="header/menu.jsp"%>
	<br>
	<h2 style="color: green;">This menu is an Interceptor</h2>
	<%@include file="header/menuinterceptor.jsp"%>
</body>

</html>