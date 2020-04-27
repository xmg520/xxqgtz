package com.mzx.xxqganswer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mzx.xxqganswer.pojo.Answer;
import com.mzx.xxqganswer.utill.JsoupUtill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class MyController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/getCont")
    public String getCont(Model model,String search)  throws IOException {
        JSONArray jsonObject = JSON.parseArray(JsoupUtill.toGet(search));
        List<Answer> answers = JSON.parseArray(jsonObject.toJSONString(),Answer.class);
        model.addAttribute("answers",answers);
        model.addAttribute("keyConT",search);
        return "index";
    }

//    @GetMapping({"/1","/index1"})
//    public String index1(){
//        return "index";
//    }
//
//    @RequestMapping("getCont1")
//    public String getCont1(Model model,String search)  throws IOException {
//        JSONArray jsonObject = JSON.parseArray(JsoupUtill.toGet(search));
//        List<Answer> answers = JSON.parseArray(jsonObject.toJSONString(),Answer.class);
////        System.out.println(answers.get(0).getTitle());
////        System.out.println(search);
//        model.addAttribute("answers",answers);
//        model.addAttribute("keyConT",search);
//        return "index";
//    }

}
