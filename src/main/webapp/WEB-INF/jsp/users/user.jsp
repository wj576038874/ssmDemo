<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/21
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8" http-equiv="content-type" content="text/html">
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <%--<td> 用户帐号</td>--%>
        <%--<td> 用户密码</td>--%>
        <td> 用户姓名</td>
        <td> 所属单位</td>
        <td> 所属部门</td>
        <td> 所属岗位</td>
        <td> 所属职位</td>
        <td> 联系方式</td>
        <td> 手机号码</td>
        <td> email</td>
        <%--<td>描述信息</td>--%>
        <%--<td>状态</td>--%>
        <%--<td> 是否删除</td>--%>
        <td> 注册时间</td>
        <td>mmsi</td>
    </tr>

    <c:forEach items="${appUserList}" var="user">
        <tr>
            <%--<td>${user.userName}</td>--%>
            <%--<td>${user.password}</td>--%>
            <td>${user.realName}</td>
            <td>${user.companyid}</td>
            <td>${user.departId}</td>
            <td>${user.roleIds}</td>
            <td>${user.position}</td>
            <td>${user.tel}</td>
            <td>${user.phoneno}</td>
            <td>${user.email}</td>
            <%--<td>${user.rmk}</td>--%>
            <%--<td>${user.status}</td>--%>
            <%--<td>${user.isDeleted}</td>--%>
            <td>${user.addTime}</td>
            <td>${user.mmsi}</td>
            <td><a style="width: 100px; height: 30px;margin: 100px;" id="btn" href="onlcik()">查看</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
