<%--
  Created by IntelliJ IDEA.
  User: Martin_working
  Date: 2018/8/25
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
        <table class="table table-hover" >
            <tr>
                <th width="20%">姓名</th>
                <th width="20%">请假原因</th>
                <th width="20%">创建时间</th>
                <th width="20%">开始时间</th>
                <th width="20%">结束时间</th>
            </tr> 
            <c:forEach items="${queryAll}" var="leave">
                <tr>
                    <th>${leave.leaveName}</th>
                    <th>${leave.leaveText}</th>
                    <th>
                        <fmt:formatDate value="${leave.createTime}" pattern='yyyy-MM-dd HH:mm:ss'/>
                    </th>
                    <th>${leave.beginTime}</th>
                    <th>${leave.endTime}</th>
                </tr>
            </c:forEach>
        </table>
        <button type="button" class="btn btn-default" onclick="output()">导出</button>
        <button type="button" class="btn btn-danger" onclick="emptyTable()">请空表</button>
</div>
    <script>
        function output() {
            location.href = "/downLeave";
        }
        function emptyTable() {
            location.href = "/delete";
        }
    </script>
</body>
</html>
