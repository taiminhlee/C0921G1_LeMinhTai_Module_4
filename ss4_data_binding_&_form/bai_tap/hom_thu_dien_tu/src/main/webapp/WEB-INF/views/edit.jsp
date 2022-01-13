<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="mailbox" action="/edit" method="post" >
    <table>
<%--        <tr>--%>
<%--            <td>Languages</td>--%>
<%--            <td>--%>
<%--            <form:options path="language" items="${languageList}"/>--%>
<%--            </td>--%>
<%--        </tr>--%>
        <tr>
            <td>Signature</td>
            <td>
                    <form:textarea path="signature"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
