
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<c:forEach var="menu" items="${menuInterceptor}">
		<li>${menu}</li>
	</c:forEach>
</ul>