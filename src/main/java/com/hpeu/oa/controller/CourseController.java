package com.hpeu.oa.controller;

import com.hpeu.oa.entity.Course;
import com.hpeu.oa.service.CourseService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "teach")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //添加课程
    @RequestMapping(value = "issue", method = RequestMethod.POST)
    @ResponseBody
    public String issue(Course course) {
        Course cou = courseService.getEntity(course.getTitle());
        if(cou.getTitle() != null){
            return "yes";
        }
        int x = 0;
        if (course != null) {
            try {
                x = courseService.add(course);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (x == 1) {
            System.out.println("存储成功");
            return "success";
        } else {
            System.out.println("存储失败");
            return "error";
        }
    }

    //查询课程
    @RequestMapping(value = "getInfo", method = RequestMethod.POST)
    @ResponseBody
    public String getInfo() {

        List<Map<String, String>> mapList = new ArrayList<>();
        List<Course> list = courseService.getAll();
        for (Course course : list) {
            Map<String, String> map = new HashMap<>();
            map.put("id", String.valueOf(course.getId()));
            map.put("title", course.getTitle());
            map.put("abs", course.getAbs());
            map.put("content", course.getContent());
            map.put("putDate", String.valueOf(course.getPutDate()));
            mapList.add(map);
        }
        String json = JSONArray.fromObject(mapList).toString();
        return json;
    }

    //进入页面
    @RequestMapping(value = "goLogin", method = RequestMethod.GET)
    public String goLogin() {
        return "teach/course";
    }

    //删除页面
    @RequestMapping(value = "delInfo", method = RequestMethod.GET)
    public String delInfo(int id) {
        courseService.del(id);
        return "teach/course";
    }

    //搜索
    @RequestMapping(value = "detail",method = RequestMethod.POST)
    @ResponseBody
    public String detail(String title){
        Course course = courseService.getInfo(title);
        if(course != null){
            Map<String, String> map = new HashMap<>();
            map.put("title",course.getTitle());
            map.put("abs",course.getAbs());
            map.put("content",course.getContent());
            return JSONObject.fromObject(map).toString();
        }
        return "error";
    }

}
