<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<c:forEach var="menu-interceptor" items="${menu-interceptor}">
		<li>${menu-interceptor}</li>
	</c:forEach>
</ul>