<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h3>Danh sách tờ khai y tế</h3>
<a href="/create">Thêm mới tờ khai y tế</a>
<p>${smg}</p>
<table border="1">
<c:forEach items="${list}" var="items" varStatus="id">
    <tr>
        <td>${id.count}</td>
        <td><a href="/edit/${id.index}">${items.ten}</a></td>
        <td>${items.cmnd}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>