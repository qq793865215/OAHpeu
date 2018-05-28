package com.hpeu.oa.controller;

import com.hpeu.oa.entity.Problem;
import com.hpeu.oa.service.ProblemService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "teach")
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    @RequestMapping(value = "goAnswer", method = RequestMethod.GET)
    public String goAnswer() {
        return "teach/problem";
    }

    @RequestMapping(value = "makeProblem", method = RequestMethod.GET)
    public String makeProblem() {
        return "teach/makeProblem";
    }

    @RequestMapping(value = "getProblem",method = RequestMethod.GET)
    public String getProblem(){
        List<Map<String,String>> mapList = new ArrayList<>();
        List<Problem> list = problemService.getAll();
        for(Problem problem : list){
            Map<String,String> map = new HashMap<>();
            map.put("id",String.valueOf(problem.getId()));
            map.put("name",problem.getName());
            map.put("content",problem.getContent());
            map.put("queDate",String.valueOf(problem.getQueDate()));
            mapList.add(map);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","");
        map.put("count",mapList.size());
        map.put("data",mapList);
        return JSONObject.fromObject(map).toString();
    }

}
