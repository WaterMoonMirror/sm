package com.example.smd.mail.service.impl;

import com.example.smd.SmdApplicationTests;
import com.example.smd.mail.service.MailService;
import com.example.smd.mail.vo.MailVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: tkn
 * @Date: 2018/9/7 20:26
 * @Description:
 */
public class MailServiceImplTest extends SmdApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void sendMail() {
        mailService.sendMail(new MailVo());
    }
}