package com.example.smd.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: tkn
 * @Date: 2018/9/8 20:12
 * @Description:
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(){
        return "index";
    }
}
