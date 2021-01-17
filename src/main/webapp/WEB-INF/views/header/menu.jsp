
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<c:forEach items="${menu }" var="item">
		<li>${item}</li>
	</c:forEach>
</ul>