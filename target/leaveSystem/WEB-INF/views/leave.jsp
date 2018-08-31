<%--
  Created by IntelliJ IDEA.
  User: Martin_working
  Date: 2018/8/25
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>信息导入系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/WdatePicker.js"></script>
</head>
<script type="text/javascript">
    function expo() {
        var startDate = document.getElementById("da1").value;
        var endDate = document.getElementById("da2").value;
        if (startDate == null || startDate == "") {
            alert("请选择起始日期");
            return false;
        }
        if (endDate == null || endDate == "") {
            alert("请选择结束日期");
            return false;
        }
        <!-- 判断时间先后顺序-->
        var startNum = parseInt(startDate.replace(/-/g, ''), 10);
        var endNum = parseInt(endDate.replace(/-/g, ''), 10);
        if (startNum > endNum) {
            alert("结束日期不能早于起始日期！");
            return false;
        }
        window.location.href = "exportWordsType.do";
    }
</script>
<body>
<div class="container">
    <div class="jumbotron">
        <h1 align="center">个人信息统计系统</h1>
        <p align="center">在这里提交你的信息</p>
    </div>

    <div class="row" align="center">
        <form action="/leave" method="post">
            <input type="text" name="leaveName" class="form-control" style="height:40px;width:450px"
                   placeholder="请假人姓名">
            <div class="panel panel-info" style="width: 450px">
                <div class="panel-heading">
                    <h3 class="panel-title" align="center">请假原因</h3>
                </div>
                <textarea name="leaveText" class="form-control" rows="5" style="resize: none;width: 100%"></textarea>
            </div>
            <div>
                <span style="font-size:14px;">
                    请假时间：
                    <input class="" type="text" name="beginTime" readonly="readonly"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                    -
                    <input class="" type="text" name="endTime" readonly="readonly"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                </span>
                <input type="button" value="导 出" onclick="expo()"/>
            </div>
            <input type="submit" class="btn btn-success" value="提交">
        </form>
    </div>


</div>

</body>

</body>
</html>
