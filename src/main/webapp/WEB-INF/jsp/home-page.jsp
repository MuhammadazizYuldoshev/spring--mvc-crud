
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME PAGE</title>
    <%@include file="base.jsp"%>
</head>
<body>

<%--<div align="center">--%>
<%--    <h1>Contact List</h1>--%>
<%--    <h3><a href="/userform">New User</a></h3>--%>
<%--    <table border="1">--%>
<%--        <th>No</th>--%>
<%--        <th>Id</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Surname</th>--%>
<%--        <th>Update</th>--%>
<%--        <th>Delete</th>--%>


<%--        <c:forEach var="user" items="${userlist}" varStatus="status">--%>
<%--            <tr>--%>
<%--                <td>${status.index + 1}</td>--%>
<%--                <td>${user.id}</td>--%>
<%--                <td>${user.name}</td>--%>
<%--                <td>${user.surname}</td>--%>

<%--                <td>--%>
<%--                    <a href="/edituser/${user.id}">Edit</a>--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <a href="/deleteuser/${user.id}">Delete</a>--%>
<%--                </td>--%>

<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</div>--%>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 CLASS="text-center mb-3">USER LIST</h1>
            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">No</th>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">SurName</th>
                    <th scope="col">DELETE</th>
                    <th scope="col">UPDATE</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${userlist}" var="user" varStatus="status">
                    <tr>
                        <td class="font-weight-bold"><i class="fa-solid fa-hashtag"></i>${status.index + 1}
                        <td class="font-weight-bold"><i class="fa-solid fa-id-badge"></i> ${user.id}</td>
                        <td class="font-weight-bold"><i class="fa-solid fa-user"></i> ${user.name}</td>
                        <td class="font-weight-bold"><i class="fa-solid fa-user"></i> ${user.surname}</td>

                        <td>
                            <a href="/deleteuser/${user.id}"><i class="fa-solid fa-user-xmark text-danger" style="font-size: 25px"></i></a>
                        </td>
                        <td>
                            <a href="/edituser/${user.id}"><i class="fa-solid fa-pen-to-square text-primary" style="font-size: 25px"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <div class="container text-center">

                <a href="/userform" class="btn btn-outline-success">ADD USER</a>

            </div>
        </div>
    </div>
</div>

</body>
</html>
