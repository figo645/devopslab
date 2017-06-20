<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	list up items
	<c:forEach var="user" items="${userList}">
		<div>
		<c:out value="${user.username}"></c:out>
		</div>
	</c:forEach>
</body>
</html>