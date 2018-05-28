<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2018/5/23
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程推送</title>
    <link rel="stylesheet" type="text/css" href="../css/course.css">
</head>
<body>
<div class="box">
    <div class="search">
        <form method="post">
            <input type="text" placeholder="请输入完整的标题..." class="searchText place" id="getTitle">
            <input type="button" value="搜索课程详情" class="searchBtn place" id="search">
            <input type="button" value="添加课程" class="addCourse place" id="addBtn">
        </form>
    </div>
    <div class="course_tab" id="info">
        <ul>
            <li>id</li>
            <li>课程标题</li>
            <li>课程摘要</li>
            <li>课程内容</li>
            <li>是否推送</li>
            <li>发布时间</li>
            <li>操作</li>
        </ul><br>
        <div id="zhuijia"></div>

    </div>
    <div class="course" id="course">
        <form method="post">
            课程标题：<input type="text" class="title" id="title" placeholder="请输入课程标题..." required maxlength="20"><br>
            课程摘要：<input type="text" class="abstract" id="abs" placeholder="请输入课程摘要..." required maxlength="50"><br>
            课程内容：<textarea id="content" rows="10" cols="55" placeholder="请输入推送课程内容..." required></textarea>
            <div class="selBtn">
                <input type="button" value="确认" class="yes" id="issue">
                <input type="button" value="取消" class="yes" id="close">
            </div>
        </form>
    </div>
    <div class="detail" id="detail">
        <div class="til">
            课程标题: &nbsp;<span id="tit"></span>
        </div>
        <div class="til">
            课程摘要：&nbsp;<span id="ab"></span>
        </div>
        <div class="content">
            课程描述：&nbsp;<span id="cont"></span>
        </div>
        <div class="ok" id="ok">确认</div>
    </div>
</div>
<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/course.js"></script>
</body>
</html>
