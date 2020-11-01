package com.mzx.xxqganswer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mzx.xxqganswer.pojo.Answer;
import com.mzx.xxqganswer.utill.JsoupUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {


    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/ma")
    public String indexma(){
        return "index1";
    }

    @RequestMapping("/getCont")
    public String getCont(Model model,String search)  throws IOException {
        JSONArray jsonObject = JSON.parseArray(JsoupUtill.toGet(search));
        List<Answer> answers = JSON.parseArray(jsonObject.toJSONString(),Answer.class);
        model.addAttribute("answers",answers);
        model.addAttribute("keyConT",search);
        return "index";
    }

}
