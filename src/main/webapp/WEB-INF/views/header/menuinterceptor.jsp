
<%@ include file ="/common/taglib.jsp" %>
<ul>
	<c:forEach var="menu" items="${menuInterceptor}">
		<li>${menu}</li>
	</c:forEach>
</ul>