<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>
	<h1>Spring World Interceptor</h1>
	<h1>Menu</h1>
	<%@include file="header/menu.jsp"%>
	<h2 style="color: green;">This menu is an interceptor</h2>

	<%@include file="header/menuinterceptor.jsp"%>
</body>

</html>