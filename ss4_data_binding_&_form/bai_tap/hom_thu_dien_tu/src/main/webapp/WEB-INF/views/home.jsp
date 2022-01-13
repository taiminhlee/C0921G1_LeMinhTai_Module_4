<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Mail Box</h3>
<p>${smg}</p>
<table border="1">
<c:forEach items="${list}" var="items" varStatus="id">
    <tr>
        <td>${id.count}</td>
        <td><a href="/edit/${id.index}">${items.email}</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>