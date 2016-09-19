<%--
  Created by IntelliJ IDEA.
  User: SeVlad
  Date: 19.09.2016
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>My ToDo List</title>
</head>
<body>
<h2>My ToDo List</h2>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Name</th>
        <th>Category</th>
        <th>Complete</th>
    </tr>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.name}</td>
            <td>${todo.category}</td>
            <td><a href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="/add-todo.do">
    <label>Task Name</label>
    <input name="new-todo" type="text"/> <br/>
    <label>Task Category</label>
    <input name="new-category" type="text"/> <br/>
    <input name="add" type="submit" value="Submit" />
</form>
</body>
</html>
