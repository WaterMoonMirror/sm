package com.example.smd.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: tkn
 * @Date: 2018/9/8 18:20
 * @Description:
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping
    public String index(){
        return "index";
    }
}
