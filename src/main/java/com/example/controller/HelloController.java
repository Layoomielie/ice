package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody       //如果是对象直接转为json数据
@Controller
//@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
