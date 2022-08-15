
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>USER FORM</title>
    <%@include file="base.jsp"%>
</head>
<body>

<h1 class="text-center mb-3">ADD USER</h1>

<form action="/saveuser" method="post">
    <div style="margin-top: 30px; margin-bottom: 400px; margin-right: 400px; margin-left: 400px">
        <div class="form-group">
            <label for="exampleInputEmail1">NAME</label>
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="name">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">SURNAME</label>
            <input type="text" class="form-control" id="exampleInputPassword1" name="surname">
        </div>

        <div style="text-align: center">
            <button type="submit" class="btn btn-outline-warning">SAVE</button>
            <a href="/" class="btn btn-outline-danger">BACK</a>
        </div>
    </div>

</form>

</body>
</html>
