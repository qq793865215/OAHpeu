<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2018/5/25
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>问题列表</title>
    <link rel="stylesheet" href="../resource/layui/css/layui.css" media="all">
</head>
<body>
<a href="makeProblem">我要提问</a>
<table id="demo" lay-filter="test"></table>
<script src="../resource/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 315
            ,url: 'getProblem' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'name', title: '用户名', width:80}
                ,{field: 'sex', title: '性别', width:80, sort: true}
                ,{field: 'title', title: '问题标题', width: 320}
                ,{field: 'content', title: '问题内容', width: 620}
                ,{field: 'do', title: '操作', width: 200}
            ]]
        });

    });
</script>
</body>
</html>
