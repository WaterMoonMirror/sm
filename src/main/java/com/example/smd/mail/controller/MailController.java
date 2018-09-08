package com.example.smd.mail.controller;

import com.example.smd.mail.service.MailService;
import com.example.smd.mail.vo.MailVo;
import com.example.smd.mail.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping
    public ResultVo<MailVo> getList(){
        List<MailVo> mailAll = mailService.getAll();
        return ResultVo.success(mailAll);
    }

    @PostMapping
    public ResultVo<MailVo> add(MailVo mailVo){
        mailService.Add(mailVo);
        return ResultVo.success(mailVo);
    }

    @PostMapping("/{id}")
    public ResultVo<MailVo> sendMail(@PathVariable String id, MailVo mailVo){
        mailService.sendMail(mailVo);
        return ResultVo.success(id);
    }
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("mail_table");
        return modelAndView;
    }



}
