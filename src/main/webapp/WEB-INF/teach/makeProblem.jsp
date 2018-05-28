<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2018/5/25
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>问题页面</title>
    <link rel="stylesheet" type="text/css" href="../css/problem.css">
    <link rel="stylesheet" href="../resource/layui/css/layui.css" media="all">
</head>
<body>
<div class="box">
    <div class="problem">
        问题提问区
    </div>
    <div class="answer">
        <form method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">标题:</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                </div>
            </div>
        </form>
        <jsp:include page="form.jsp"/>
    </div>
</div>
</body>
</html>
