package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("spring-mvc")
    public String springMvc(Model model){
        model.addAttribute("msg", "홍길동 친구");
        return "spring-mvc";
    }

    @GetMapping("/hello")
    public String hello(Model model){
        //hello.html view에게 데이터 전달 --> Model(AndView)
        model.addAttribute("msg", "홍길동");
        return "hello"; // view name : msg="홍길동"
    }

}
