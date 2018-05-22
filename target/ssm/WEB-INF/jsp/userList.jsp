<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>测试</title>
</head>

<body>

<div style="margin: 0 auto;">
    <table style="margin:  0 auto;">
        <th></th>
        <c:forEach var="i" items="${users}">
            <tr>
                <td> ${i.userName}
                </td>
                <td>
                    <a href="/user/deleteUser/${i.id}">删除</a>
                    <a href="/user/userInfoPath/${i.id}">userInfo</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
