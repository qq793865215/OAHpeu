$(function () {
    var btn = $("#addBtn");
    var course = $("#course");
    var close = $("#close");
    var issue = $("#issue");
    var selAll = $("#selAll");
    var allCheck = $("input[type='checkbox']");

    //格式化时间
    function filterTime(val) {
        if (val < 10) {
            return "0" + val;
        } else {
            return val;
        }
    }

    //获取当前时间
    var time = new Date();
    var submitTime = time.getFullYear() + '-' + filterTime(time.getMonth() + 1) + '-' + filterTime(time.getDate()) + ' ' + filterTime(time.getHours()) + ':' + filterTime(time.getMinutes()) + ':' + filterTime(time.getSeconds());

    //显示和隐藏
    btn.click(function () {
        course.show();
    })
    close.click(function () {
        course.hide();
    })

    //添加课程
    issue.click(function () {
        var title = $("#title").val();
        var abs = $("#abs").val();
        var content = $("#content").val();
        var json = {
            title: title,
            abs: abs,
            content: content,
            putDate: submitTime
        }
        if(title != "" && abs !="" && content!=null){
            $.post("issue", json, function (date) {
                if (date == "success") {
                    location.reload();
                }else if(date == "yes"){
                    alert("标题已存在");
                }
                else {
                    alert("发布失败");
                }
            })
        }else{
            alert("不能存在空课程");
        }
    })

    //获取课程信息
    $.post("getInfo", (1), function (date) {
        // var  jsonD = $.parseJSON(date);
        var jsonD = eval("(" + date + ")");
        var htm = "";
        for (var i = 0; i < jsonD.length; i++) {
            htm += "<ul><li>" + jsonD[i].id + "</li><li>" + jsonD[i].title + "</li><li>" + jsonD[i].abs + "</li>" +
                "<li>" + jsonD[i].content + "</li><li>是</li><li>" + jsonD[i].putDate + "</li>" +
                "<li><a href='delInfo?id=" + jsonD[i].id + "' >删除</a></li></ul><br>";
        }
        // console.log(htm)
        $("#zhuijia").html(htm);
    })

    //搜索详情
    var til = $("#getTitle");
    var search = $("#search");
    var info = $("#info");
    var detail = $("#detail")
    var tit = $("#tit");
    var ab = $("#ab");
    var cont = $("#cont");
    var ok = $("#ok");
    detail.hide();
    search.click(function () {
        var json = {
            title : til.val()
        }
        $.post("detail", json, function (date) {
            var thmT = "";
            var thmA = "";
            var thmC = "";
            tit.html(thmT);
            ab.html(thmA);
            cont.html(thmC);
            if(date != "error"){
                var  jsonD = $.parseJSON(date);
                detail.show();
                info.hide();
                var thmT = "<span>"+jsonD.title+"</span>";
                var thmA = "<span>"+jsonD.abs+"</span>";
                var thmC = "<span>"+jsonD.content+"</span>";
                tit.html(thmT);
                ab.html(thmA);
                cont.html(thmC);
            }else{
                alert("标题输入错误");
            }
        })


    })
    ok.click(function () {
        info.show();
        detail.hide();
    })


})