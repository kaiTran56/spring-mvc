
<%@ include file="/common/taglib.jsp"%>

<ul>
	<c:forEach items="${menu }" var="item">
		<li>${item}</li>
	</c:forEach>
</ul>