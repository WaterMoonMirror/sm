package com.example.smd.mail.controller;

import com.example.smd.mail.domain.MailDo;
import com.example.smd.mail.service.MailService;
import com.example.smd.mail.vo.ResultVo;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping
    public ResultVo getList(){
        List<MailDo> mailAll = mailService.getAll();
        return ResultVo.success(mailAll);
    }

}
