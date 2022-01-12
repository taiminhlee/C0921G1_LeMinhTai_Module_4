<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/1/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/result">
    <input type="text" name="num1" >
    <input type="text" name="num2"><br>
    <button type="submit" name="operator" value="+">Addition(+)</button>
    <button type="submit" name="operator" value="-">Subtraction(-)</button>
    <button type="submit" name="operator" value="*">Multiplication(X)</button>
    <button type="submit" name="operator" value="/">Division(:)</button>
  </form>
  <span>Result: ${result}</span>
  </body>
</html>
