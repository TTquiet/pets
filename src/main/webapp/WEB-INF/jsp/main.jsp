<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>宠物信息列表</title>
    <link rel="stylesheet" href="/statics/css/bootstrap.css" type="text/css">
</head>
<body class="container">
<h2>宠物信息</h2>
<a href="/pet/add" class="btn btn-success">添加宠物</a>
<a href="/pet/findByBreed" class="btn btn-info" > 查询</a>
<form action="/user/delchk" method="post">
    <input type="submit" value="批量删除" class="btn btn-primary" />

    <table class="table">
        <tr>
            <th>宠物昵称</th>
            <th>出生日期</th>
            <th>性别</th>
        </tr>
        <c:forEach items="${plist}" var="pet">
            <tr>
                
                <td>${pet.petName}</td>
                <td>${pet.birthday}</td>
                <c:if test="${pet.petSex = 1}">
                    <td>雄</td>
                </c:if>
                <c:if test="${pet.petSex = 2}">
                    <td>雌</td>
                </c:if>
            </tr>
        </c:forEach>
    </table>
</form>



<script src="/statics/js/jquery-1.12.4.js" type="text/javascript"></script>
<script src="/statics/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>
