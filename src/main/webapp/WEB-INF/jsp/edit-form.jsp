<%--
  Created by IntelliJ IDEA.
  User: Muhammadaziz
  Date: 8/15/2022
  Time: 11:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT FORM</title>
    <%@include file="base.jsp"%>
</head>
<body>

<h1 class="text-center mb-3">UPDATE USER</h1>

<form action="/updateuser" method="post">
    <div style="margin-top: 30px; margin-bottom: 400px; margin-right: 400px; margin-left: 400px">
        <input type="hidden" name="id" value="${user.id}">
        <div class="form-group">
            <label for="exampleInputEmail1">NAME</label>
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="name" value="${user.name}"/>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">SURNAME</label>
            <input type="text" class="form-control" id="exampleInputPassword1" name="surname" value="${user.surname}"/>
        </div>

        <div style="text-align: center">
            <button type="submit" class="btn btn-outline-warning">UPDATE</button>
            <a href="/" class="btn btn-outline-danger">BACK</a>
        </div>
    </div>

</form>

</body>
</html>
