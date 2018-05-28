package com.hpeu.oa.controller;

import com.hpeu.oa.entity.User;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
//
//    @Autowired
//    private TeachService teachService;

    /**
     * 判断是否登录
     * 推送课程
     */
//    @RequestMapping(value = "putCourse",method = RequestMethod.POST)
//    public String putCourse(){
//
//        String sql = "";
//        teachService.getEntity(sql);
//
//        return "course";
//    }
    @RequestMapping(value = "dengLu" ,method = RequestMethod.POST)
    @ResponseBody
    public String dengLu(User user){

        Map<String,String> map = new HashMap<>();
        if("admin".equals(user.getAccount())&&"123456".equals(user.getPassword())){
            map.put("info","success");
            return JSONObject.fromObject(map).toString();
        }
        return "aaa";
    }
    @RequestMapping(value = "success",method = RequestMethod.GET)
    public String success(){
        return "success";
    }

}
