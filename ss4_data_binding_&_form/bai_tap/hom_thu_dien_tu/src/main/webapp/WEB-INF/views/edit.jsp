<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Settings</h3>
<form:form modelAttribute="mailbox" action="/edit" method="post" >
    <table>
        <tr>
            <td>
             <form:hidden path="email" />
            </td>
        </tr>
        <tr>
            <td>Languages</td>
            <td>
                <form:select path="language">
                    <form:options items="${languageList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page Size</td>
            <td>
                <form:select path="pageSize">
                    <form:options items="${pageSizeList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Spam filter</td>
            <td>
                <form:checkbox path="spamFilter" label="Enable spam filter"/>
            </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>
                    <form:textarea path="signature"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Update</button>
                <button><a href="/home" style="text-decoration: none">Cancle</a></button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
