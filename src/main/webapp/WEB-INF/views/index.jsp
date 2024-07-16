<%--
  Created by IntelliJ IDEA.
  User: WIN 10
  Date: 13/07/2024
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary English-Vietnamese</h1>
<form action="/search" method="post">
    <label for="eng" >Input word:</label>
    <input type="text" id="eng" name="eng">
    <button type="submit">Search</button>
</form>


<p name="result">Result: <span style="color: blue">${result}</span></p>
</body>
</html>
