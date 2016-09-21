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
<form method="post" action="/delete-todo.do">
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Name</th>
        <th>Category</th>
        <th>Complete</th>
    </tr>
    <c:forEach items="${todos}" var="todo" varStatus="loop">
        <tr>
            <td>${todo.name}</td>
            <td>${todo.category}</td>
            <td><input type="checkbox" name="deletedTasks" value="${loop.index}" /></td>
        </tr>
    </c:forEach>
</table>
    <input name="delete" type="submit" value="Update Tasks"/>
</form>
<form method="post" action="/add-todo.do">
    <label>Task Name</label>
    <input name="new-todo" type="text"/> <br/>
    <label>Task Category</label>
    <input name="new-category" type="text"/> <br/>
    <input name="add" type="submit" value="Add Task" />
</form>
</body>
</html>
